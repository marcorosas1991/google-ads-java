// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/extensions.proto

package com.google.ads.googleads.v2.common;

public interface PriceFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.PriceFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Price extension type of this extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.PriceExtensionTypeEnum.PriceExtensionType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Price extension type of this extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.PriceExtensionTypeEnum.PriceExtensionType type = 1;</code>
   * @return The type.
   */
  com.google.ads.googleads.v2.enums.PriceExtensionTypeEnum.PriceExtensionType getType();

  /**
   * <pre>
   * Price qualifier for all offers of this price extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier price_qualifier = 2;</code>
   * @return The enum numeric value on the wire for priceQualifier.
   */
  int getPriceQualifierValue();
  /**
   * <pre>
   * Price qualifier for all offers of this price extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier price_qualifier = 2;</code>
   * @return The priceQualifier.
   */
  com.google.ads.googleads.v2.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier getPriceQualifier();

  /**
   * <pre>
   * Tracking URL template for all offers of this price extension.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 3;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * Tracking URL template for all offers of this price extension.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 3;</code>
   * @return The trackingUrlTemplate.
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * Tracking URL template for all offers of this price extension.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * The code of the language used for this price extension.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 4;</code>
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * The code of the language used for this price extension.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 4;</code>
   * @return The languageCode.
   */
  com.google.protobuf.StringValue getLanguageCode();
  /**
   * <pre>
   * The code of the language used for this price extension.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLanguageCodeOrBuilder();

  /**
   * <pre>
   * The price offerings in this price extension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.PriceOffer price_offerings = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v2.common.PriceOffer> 
      getPriceOfferingsList();
  /**
   * <pre>
   * The price offerings in this price extension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.PriceOffer price_offerings = 5;</code>
   */
  com.google.ads.googleads.v2.common.PriceOffer getPriceOfferings(int index);
  /**
   * <pre>
   * The price offerings in this price extension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.PriceOffer price_offerings = 5;</code>
   */
  int getPriceOfferingsCount();
  /**
   * <pre>
   * The price offerings in this price extension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.PriceOffer price_offerings = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.common.PriceOfferOrBuilder> 
      getPriceOfferingsOrBuilderList();
  /**
   * <pre>
   * The price offerings in this price extension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.PriceOffer price_offerings = 5;</code>
   */
  com.google.ads.googleads.v2.common.PriceOfferOrBuilder getPriceOfferingsOrBuilder(
      int index);

  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 6;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 6;</code>
   * @return The finalUrlSuffix.
   */
  com.google.protobuf.StringValue getFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlSuffixOrBuilder();
}
