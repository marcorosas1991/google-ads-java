// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/customer_client.proto

package com.google.ads.googleads.v1.resources;

public interface CustomerClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.CustomerClient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the customer client.
   * CustomerClient resource names have the form:
   * `customers/{customer_id}/customerClients/{client_customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the customer client.
   * CustomerClient resource names have the form:
   * `customers/{customer_id}/customerClients/{client_customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the clientCustomer field is set.
   */
  boolean hasClientCustomer();
  /**
   * <pre>
   * Output only. The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The clientCustomer.
   */
  com.google.protobuf.StringValue getClientCustomer();
  /**
   * <pre>
   * Output only. The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getClientCustomerOrBuilder();

  /**
   * <pre>
   * Output only. Specifies whether this is a
   * [hidden account](https://support.google.com/google-ads/answer/7519830).
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hidden field is set.
   */
  boolean hasHidden();
  /**
   * <pre>
   * Output only. Specifies whether this is a
   * [hidden account](https://support.google.com/google-ads/answer/7519830).
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hidden.
   */
  com.google.protobuf.BoolValue getHidden();
  /**
   * <pre>
   * Output only. Specifies whether this is a
   * [hidden account](https://support.google.com/google-ads/answer/7519830).
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHiddenOrBuilder();

  /**
   * <pre>
   * Output only. Distance between given customer and client. For self link, the level value
   * will be 0. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value level = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the level field is set.
   */
  boolean hasLevel();
  /**
   * <pre>
   * Output only. Distance between given customer and client. For self link, the level value
   * will be 0. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value level = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The level.
   */
  com.google.protobuf.Int64Value getLevel();
  /**
   * <pre>
   * Output only. Distance between given customer and client. For self link, the level value
   * will be 0. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value level = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLevelOrBuilder();
}
