package com.example.demo.util;

public class ResponseUtils {

  public static <T> APIResponse<T> ok(String meta, T payload) {
    APIResponse<T> apiResponse = new APIResponse<>();
    apiResponse.setMeta(meta);
    apiResponse.setSuccess(true);
    apiResponse.setPayload(payload);
    return apiResponse;
  }

  public static APIResponse<Void> ok(String meta) {
    APIResponse<Void> apiResponse = new APIResponse<>();
    apiResponse.setMeta(meta);
    apiResponse.setSuccess(true);
    return apiResponse;
  }

  public static <T> APIResponse<T> notOk(String meta, T payload) {
    APIResponse<T> apiResponse = new APIResponse<>();
    apiResponse.setMeta(meta);
    apiResponse.setPayload(payload);
    apiResponse.setSuccess(false);
    return apiResponse;
  }

  public static APIResponse<Void> notOk(String meta) {
    APIResponse<Void> apiResponse = new APIResponse<>();
    apiResponse.setMeta(meta);
    apiResponse.setSuccess(false);
    return apiResponse;
  }

  public static APIResponse<Object> error(String meta) {
    APIResponse<Object> apiResponse = new APIResponse<>();
    apiResponse.setMeta(meta);
    apiResponse.setSuccess(false);
    return apiResponse;
  }

  public static <T> APIResponse<T> error(String meta, T payload) {
    APIResponse<T> apiResponse = new APIResponse<>();
    apiResponse.setMeta(meta);
    apiResponse.setSuccess(false);
    apiResponse.setPayload(payload);
    return apiResponse;
  }
}
