package test;

//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.aliyuncs.DefaultAcsClient;
//import com.aliyuncs.IAcsClient;
//import com.aliyuncs.exceptions.ClientException;
//import com.aliyuncs.exceptions.ServerException;
//import com.aliyuncs.green.model.v20180509.ImageSyncScanRequest;
//import com.aliyuncs.http.FormatType;
//import com.aliyuncs.http.HttpResponse;
//import com.aliyuncs.http.MethodType;
//import com.aliyuncs.http.ProtocolType;
//import com.aliyuncs.profile.DefaultProfile;
//import com.aliyuncs.profile.IClientProfile;

import com.baidu.aip.ocr.AipOcr;

import java.util.HashMap;

import org.json.JSONObject;

public class Test {

	// 设置APPID/AK/SK
	public static final String APP_ID = "19814918";
	public static final String API_KEY = "3DLvbm7uDIcvsRHREAWkQlEw";
	public static final String SECRET_KEY = "YPbr2voARRUvl3UkVHSUQ1fowVqYygwH";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");

//		IClientProfile profile = DefaultProfile.getProfile("cn-shanghai", "18do61uw0q4ehxnd3lizum1qybbdgxwl",
//				"9b8e8d3e96d143a6bbbcd0bf8f1dddad");
//		DefaultProfile.addEndpoint("cn-shanghai", "cn-shanghai", "Green", "green.cn-shanghai.aliyuncs.com");
//		IAcsClient client = new DefaultAcsClient(profile);
//
//		ImageSyncScanRequest imageSyncScanRequest = new ImageSyncScanRequest();
//		// 指定返回格式。
//		imageSyncScanRequest.setAcceptFormat(FormatType.JSON);
//		// 指定请求方法。
//		imageSyncScanRequest.setMethod(MethodType.POST);
//		imageSyncScanRequest.setEncoding("utf-8");
//		// 支持HTTP和HTTPS。
//		imageSyncScanRequest.setProtocol(ProtocolType.HTTPS);
//
//		JSONObject httpBody = new JSONObject();
//		/**
//		 * 设置要检测的场景。 ocr：表示OCR图文识别和OCR卡证识别。
//		 */
//		httpBody.put("scenes", Arrays.asList("ocr"));
//
//		/**
//		 * 设置待检测的图片，一张图片对应一个检测任务。 多张图片同时检测时，处理时间由最后一张处理完的图片决定。
//		 * 通常情况下批量检测的平均响应时间比单任务检测长，一次批量提交的图片数越多，响应时间被拉长的概率越高。
//		 * 代码中以单张图片检测作为示例，如果需要批量检测多张图片，请自行构建多个任务。
//		 */
//		JSONObject task = new JSONObject();
//		task.put("dataId", UUID.randomUUID().toString());
//
//		// 设置图片链接。
//		task.put("url",
//				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1589103763932&di=fe34d3e2c9e5cf8f859cf69209c39658&imgtype=0&src=http%3A%2F%2Fwww.bizhidaquan.com%2Fd%2Ffile%2F1%2F1159829.jpg");
//		task.put("time", new Date());
//		httpBody.put("tasks", Arrays.asList(task));
//
//		// 需要OCR卡证识别时，设置卡证类型。
//		JSONObject cardExtras = new JSONObject();
//		// 身份证正面识别。
//		cardExtras.put("card", "id-card-front");
//		// 身份证反面。
//		// cardExtras.put("card", "id-card-back");
//		httpBody.put("extras", cardExtras);
//		imageSyncScanRequest.setHttpContent(
//				org.apache.commons.codec.binary.StringUtils.getBytesUtf8(httpBody.toJSONString()), "UTF-8",
//				FormatType.JSON);
//		/**
//		 * 请设置超时时间，服务端全链路处理超时时间为10秒，请据此做相应设置。 如果您设置的ReadTimeout小于服务端处理的时间，程序中会获得一个read
//		 * timeout异常。
//		 */
//		imageSyncScanRequest.setConnectTimeout(3000);
//		imageSyncScanRequest.setReadTimeout(10000);
//		HttpResponse httpResponse = null;
//		try {
//			httpResponse = client.doAction(imageSyncScanRequest);
//		} catch (ServerException e) {
//			e.printStackTrace();
//		} catch (ClientException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		// 服务端接收到请求，并完成处理返回的结果。
//		if (httpResponse != null && httpResponse.isSuccess()) {
//			JSONObject scrResponse = JSON.parseObject(
//					org.apache.commons.codec.binary.StringUtils.newStringUtf8(httpResponse.getHttpContent()));
//			System.out.println(JSON.toJSONString(scrResponse));
//			int requestCode = scrResponse.getIntValue("code");
//			// 每一张图片的检测结果。
//			JSONArray taskResults = scrResponse.getJSONArray("data");
//			if (200 == requestCode) {
//				for (Object taskResult : taskResults) {
//					// 单张图片的处理结果。
//					int taskCode = ((JSONObject) taskResult).getIntValue("code");
//					// 对应检测场景下图片的处理结果。如果是多个场景，则会有每个场景的结果。
//					JSONArray sceneResults = ((JSONObject) taskResult).getJSONArray("results");
//					if (200 == taskCode) {
//						for (Object sceneResult : sceneResults) {
//							String scene = ((JSONObject) sceneResult).getString("scene");
//							String suggestion = ((JSONObject) sceneResult).getString("suggestion");
//							// do something
//							// 识别出来的身份证信息。
//							if ("review".equals(suggestion) && "ocr".equals(scene)) {
//								JSONObject idCardInfo = ((JSONObject) sceneResult).getJSONObject("idCardInfo");
//								System.out.println(idCardInfo.toJSONString());
//							}
//						}
//					} else {
//						// 单张图片处理失败，原因视具体的情况详细分析。
//						System.out.println("task process fail. task response:" + JSON.toJSONString(taskResult));
//					}
//				}
//			} else {
//				/**
//				 * 表明请求整体处理失败，原因视具体的情况详细分析。
//				 */
//				System.out.println("the whole image scan request failed. response:" + JSON.toJSONString(scrResponse));
//			}
//		} else {
//			System.out.println("请求错误"+httpResponse);
//		}

		// 百度云
		// 初始化一个AipOcr
		AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

		// 可选：设置网络连接参数
		client.setConnectionTimeoutInMillis(2000);
		client.setSocketTimeoutInMillis(60000);

		// 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

		// 可选：设置log4j日志输出格式，若不设置，则使用默认配置
		// 也可以直接通过jvm启动参数设置此环境变量
//        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

		// 调用接口
		String image = "/Users/wangdaqiang/Desktop/image/1271584508116_.pic_hd.jpg";
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		JSONObject res = client.basicGeneral(image, options);
		System.out.println(res.toString(2));

	}

}
