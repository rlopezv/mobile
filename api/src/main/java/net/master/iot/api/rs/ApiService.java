/**
 *
 */
package net.master.iot.api.rs;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import net.master.iot.api.data.LineGeoRoute;
import net.master.iot.api.data.LineInfo;
import net.master.iot.api.data.LineRoute;
import net.master.iot.api.data.StopDetail;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Class for accessing EMT OpenData Rest API
 *
 * Is required to register for an id and passkey
 *
 * @author
 *
 */
public class ApiService {

	private final static String API_CLIENT_ID = "WEB.SERV.ramon.lopez.viana@alumnos.upm.es";
	private final static String API_PASSKEY = "8B3A48C1-27EA-4D16-9445-E83BE64017AD";

	private final static String BASE_URL = "https://openbus.emtmadrid.es/emt-proxy-server/last";
	private final static String GET_STOPS_FROM_XY = "/geo/getStopsFromXY.php";
	private final static String GET_STOPS_LINE = "/geo/getStopsLine.php";
	private final static String GET_INFO_LINE_EXTENDED = "/geo/GetInfoLineExtend.php";
	private final static String GET_INFO_LINE = "/geo/getInfoLine.php";
	private final static String GET_ROUTE_LINES_ROUTE = "/geo/GetRouteLinesRoute.php";

	private String id;
	private String passKey;

	private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Constructor
	 *
	 * @param id
	 *            emt user id
	 * @param passKey
	 *            emt passkey
	 */
	public ApiService(String id, String passKey) {
		this.id = id;
		this.passKey = passKey;
	}

	/**
	 * Builds the client used for API invocation
	 *
	 * @return
	 */
	protected OkHttpClient getClient() {

		OkHttpClient client = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS)
				.writeTimeout(10, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).build();
		return client;
	}

	/**
	 *
	 * @return
	 */
	protected String getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 */
	protected void setId(String id) {
		this.id = id;
	}

	/**
	 *
	 * @return
	 */
	protected String getPassKey() {
		return passKey;
	}

	/**
	 *
	 * @param passKey
	 */
	protected void setPassKey(String passKey) {
		this.passKey = passKey;
	}

	public LineRoute getLineStops(String line) throws IOException {
		RequestBody formBody = new FormBody.Builder().add("idClient", getId()).add("passKey", getPassKey())
				.add("line", line).build();
		Request request = new Request.Builder().url(BASE_URL + GET_STOPS_LINE).post(formBody).build();
		return (LineRoute) process(getClient().newCall(request).execute(), LineRoute.class);
	}

	public LineRoute getInfoLineExtended(String line) throws IOException {
		System.out.println(getToday());
		RequestBody formBody = new FormBody.Builder().add("idClient", getId()).add("passKey", getPassKey())
				.add("line", line).add("fecha", getToday()).build();
		Request request = new Request.Builder().url(BASE_URL + GET_INFO_LINE_EXTENDED).post(formBody).build();
		return (LineRoute) process(getClient().newCall(request).execute(), LineRoute.class);
	}

	public LineGeoRoute getRouteLinesRoute(String... lines) throws IOException {
		System.out.println(parseLines(lines));
		RequestBody formBody = new FormBody.Builder().add("idClient", getId()).add("passKey", getPassKey())
				.add("Lines", parseLines(lines)).add("SelectDate", getToday()).build();
		Request request = new Request.Builder().url(BASE_URL + GET_ROUTE_LINES_ROUTE).post(formBody).build();
		return (LineGeoRoute) process(getClient().newCall(request).execute(), LineGeoRoute.class);
	}

	public LineInfo getInfoLine(String line) throws IOException {
		RequestBody formBody = new FormBody.Builder().add("idClient", getId()).add("passKey", getPassKey())
				.add("line", line).add("fecha", getToday()).build();
		Request request = new Request.Builder().url(BASE_URL + GET_INFO_LINE).post(formBody).build();
		return (LineInfo) process(getClient().newCall(request).execute(), LineInfo.class);
	}

	public StopDetail getStopsFromXY(double lon, double lat, int radius) throws IOException {
		RequestBody formBody = new FormBody.Builder().add("idClient", getId()).add("passKey", getPassKey())
				.add("longitude", String.valueOf(lon)).add("latitude", String.valueOf(lat))
				.add("Radius", String.valueOf(radius)).build();
		Request request = new Request.Builder().url(BASE_URL + GET_STOPS_FROM_XY).post(formBody).build();
		return (StopDetail) process(getClient().newCall(request).execute(), StopDetail.class);
	}

	private Object process(Response response, Class<?> targetClass) throws IOException {
		Object result = null;
		if (response.code() == 200) {
			String content = response.body().string();

			System.out.println(content);
			/* Convert to JSON */
			final Gson gson = new Gson();
			result = gson.fromJson(content, targetClass);
		} else {
			// return null;
			System.err.println(response.body().string());
		}
		return result;
	}

	private String parseLines(String... lines) {
		String result = "";
		for (String line : lines) {
			result = result.concat(line);
			result = result.concat("|");
		}
		if (result.length() > 0) {
			result = result.substring(0, result.length() - 1);
		}
		return result;
	}

	private String getToday() {
		return DATE_FORMAT.format(new Date());
	}

	public static void main(String args[]) throws IOException {
		ApiService service = new ApiService(API_CLIENT_ID, API_PASSKEY);
		System.out.println(service.getStopsFromXY(-3.68169, 40.51827, 1000).getStop());
		// System.out.println(service.getRouteLinesRoute("63").getResultValues());
		// System.out.println(service.getLineStops("63").getStop());
	}

}
