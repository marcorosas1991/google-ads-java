// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/conversion_upload_service.proto

package com.google.ads.googleads.v1.services;

public interface ClickConversionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.ClickConversion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Google click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   * @return Whether the gclid field is set.
   */
  boolean hasGclid();
  /**
   * <pre>
   * The Google click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   * @return The gclid.
   */
  com.google.protobuf.StringValue getGclid();
  /**
   * <pre>
   * The Google click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getGclidOrBuilder();

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 2;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 2;</code>
   * @return The conversionAction.
   */
  com.google.protobuf.StringValue getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getConversionActionOrBuilder();

  /**
   * <pre>
   * The date time at which the conversion occurred. Must be after
   * the click time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
   * @return Whether the conversionDateTime field is set.
   */
  boolean hasConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. Must be after
   * the click time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
   * @return The conversionDateTime.
   */
  com.google.protobuf.StringValue getConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. Must be after
   * the click time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getConversionDateTimeOrBuilder();

  /**
   * <pre>
   * The value of the conversion for the advertiser.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue conversion_value = 4;</code>
   * @return Whether the conversionValue field is set.
   */
  boolean hasConversionValue();
  /**
   * <pre>
   * The value of the conversion for the advertiser.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue conversion_value = 4;</code>
   * @return The conversionValue.
   */
  com.google.protobuf.DoubleValue getConversionValue();
  /**
   * <pre>
   * The value of the conversion for the advertiser.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue conversion_value = 4;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getConversionValueOrBuilder();

  /**
   * <pre>
   * Currency associated with the conversion value. This is the ISO 4217
   * 3-character currency code. For example: USD, EUR.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5;</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Currency associated with the conversion value. This is the ISO 4217
   * 3-character currency code. For example: USD, EUR.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5;</code>
   * @return The currencyCode.
   */
  com.google.protobuf.StringValue getCurrencyCode();
  /**
   * <pre>
   * Currency associated with the conversion value. This is the ISO 4217
   * 3-character currency code. For example: USD, EUR.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder();

  /**
   * <pre>
   * The order ID associated with the conversion. An order id can only be used
   * for one conversion per conversion action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue order_id = 6;</code>
   * @return Whether the orderId field is set.
   */
  boolean hasOrderId();
  /**
   * <pre>
   * The order ID associated with the conversion. An order id can only be used
   * for one conversion per conversion action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue order_id = 6;</code>
   * @return The orderId.
   */
  com.google.protobuf.StringValue getOrderId();
  /**
   * <pre>
   * The order ID associated with the conversion. An order id can only be used
   * for one conversion per conversion action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue order_id = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getOrderIdOrBuilder();

  /**
   * <pre>
   * Additional data about externally attributed conversions. This field
   * is required for conversions with an externally attributed conversion
   * action, but should not be set otherwise.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.ExternalAttributionData external_attribution_data = 7;</code>
   * @return Whether the externalAttributionData field is set.
   */
  boolean hasExternalAttributionData();
  /**
   * <pre>
   * Additional data about externally attributed conversions. This field
   * is required for conversions with an externally attributed conversion
   * action, but should not be set otherwise.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.ExternalAttributionData external_attribution_data = 7;</code>
   * @return The externalAttributionData.
   */
  com.google.ads.googleads.v1.services.ExternalAttributionData getExternalAttributionData();
  /**
   * <pre>
   * Additional data about externally attributed conversions. This field
   * is required for conversions with an externally attributed conversion
   * action, but should not be set otherwise.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.ExternalAttributionData external_attribution_data = 7;</code>
   */
  com.google.ads.googleads.v1.services.ExternalAttributionDataOrBuilder getExternalAttributionDataOrBuilder();
}
