package com.guoguo.common;


/**
 * 系统状态码
 * @author
 *
 */
public class Constants {
	
	/**
	 * 成功
	 */
	public static final String SUCCESS_CODE ="200";
	
	/**
	 * 请求失败
	 */
	public static final String REQUEST_ERROR_CODE ="301";
	
	/**
	 * 服务器未能理解请求
	 */
	public static final String BADREQUEST_AUTH_CODE ="400";
	
	/**
	 * 未授权
	 */
	public static final String UNAUTHORIZED_AUTH_CODE ="401";
	
	/**
	 * 无权访问该资源
	 */
	public static final String NO_AUTH_CODE ="403";
	
	/**
	 * 请求格式错误
	 */
	public static final String ERROR_FORMAT_CODE ="415";
	
	/**
	 * 校验错误
	 */
	public static final String ERROR_VALID_CODE ="422";
	
	/**
	 *系统错误
	 */
	public static final String ERROR_SYSTEM_CODE ="500";
	
	/**
	 * 未登录
	 */
	public static final String USER_NO_LOGIN ="501";

	/** 服务调用超时错误 */
	public static final String API_SERVER_ERROR_TIMEOUT = "502";

	public static class SYSTEM_CODE{

		/**
		 * 等级
		 */
		public static final String PRODUCT_LV = "product_lv";

		/**
		 * 计价单位
		 */
		public static final String UNIT = "unit";

		/**
		 * 规格单位
		 */
		public static final String STANDARD_UNIT = "standard_unit";

	}

	public static class IS_DEL{

		/**
		 * 删除
		 */
		public static final Byte YES = 1;

		/**
		 * 未删除
		 */
		public static final Byte NO = 0;
	}

	public static class USE_STATE{
		/**
		 * 有效
		 */
		public static final Integer VALID = 1;

		/**
		 * 无效
		 */
		public static final Integer INVALID = 0;
	}

}
