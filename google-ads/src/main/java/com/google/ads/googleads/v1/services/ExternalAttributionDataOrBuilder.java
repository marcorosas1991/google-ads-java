// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/conversion_upload_service.proto

package com.google.ads.googleads.v1.services;

public interface ExternalAttributionDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.ExternalAttributionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Represents the fraction of the conversion that is attributed to the
   * Google Ads click.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
   * @return Whether the externalAttributionCredit field is set.
   */
  boolean hasExternalAttributionCredit();
  /**
   * <pre>
   * Represents the fraction of the conversion that is attributed to the
   * Google Ads click.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
   * @return The externalAttributionCredit.
   */
  com.google.protobuf.DoubleValue getExternalAttributionCredit();
  /**
   * <pre>
   * Represents the fraction of the conversion that is attributed to the
   * Google Ads click.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getExternalAttributionCreditOrBuilder();

  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
   * @return Whether the externalAttributionModel field is set.
   */
  boolean hasExternalAttributionModel();
  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
   * @return The externalAttributionModel.
   */
  com.google.protobuf.StringValue getExternalAttributionModel();
  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getExternalAttributionModelOrBuilder();
}
