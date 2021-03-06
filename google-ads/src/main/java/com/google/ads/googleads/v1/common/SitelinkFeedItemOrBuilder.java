// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/extensions.proto

package com.google.ads.googleads.v1.common;

public interface SitelinkFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.SitelinkFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * URL display text for the sitelink.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue link_text = 1;</code>
   * @return Whether the linkText field is set.
   */
  boolean hasLinkText();
  /**
   * <pre>
   * URL display text for the sitelink.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue link_text = 1;</code>
   * @return The linkText.
   */
  com.google.protobuf.StringValue getLinkText();
  /**
   * <pre>
   * URL display text for the sitelink.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue link_text = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLinkTextOrBuilder();

  /**
   * <pre>
   * First line of the description for the sitelink.
   * If this value is set, line2 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue line1 = 2;</code>
   * @return Whether the line1 field is set.
   */
  boolean hasLine1();
  /**
   * <pre>
   * First line of the description for the sitelink.
   * If this value is set, line2 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue line1 = 2;</code>
   * @return The line1.
   */
  com.google.protobuf.StringValue getLine1();
  /**
   * <pre>
   * First line of the description for the sitelink.
   * If this value is set, line2 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue line1 = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLine1OrBuilder();

  /**
   * <pre>
   * Second line of the description for the sitelink.
   * If this value is set, line1 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue line2 = 3;</code>
   * @return Whether the line2 field is set.
   */
  boolean hasLine2();
  /**
   * <pre>
   * Second line of the description for the sitelink.
   * If this value is set, line1 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue line2 = 3;</code>
   * @return The line2.
   */
  com.google.protobuf.StringValue getLine2();
  /**
   * <pre>
   * Second line of the description for the sitelink.
   * If this value is set, line1 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue line2 = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLine2OrBuilder();

  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 4;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalUrlsList();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 4;</code>
   */
  com.google.protobuf.StringValue getFinalUrls(int index);
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 4;</code>
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 4;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalUrlsOrBuilderList();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 5;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalMobileUrlsList();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 5;</code>
   */
  com.google.protobuf.StringValue getFinalMobileUrls(int index);
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 5;</code>
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 5;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalMobileUrlsOrBuilderList();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalMobileUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 6;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 6;</code>
   * @return The trackingUrlTemplate.
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CustomParameter url_custom_parameters = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v1.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CustomParameter url_custom_parameters = 7;</code>
   */
  com.google.ads.googleads.v1.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CustomParameter url_custom_parameters = 7;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CustomParameter url_custom_parameters = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v1.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CustomParameter url_custom_parameters = 7;</code>
   */
  com.google.ads.googleads.v1.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * Final URL suffix to be appended to landing page URLs served with
   * parallel tracking.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 8;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * Final URL suffix to be appended to landing page URLs served with
   * parallel tracking.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 8;</code>
   * @return The finalUrlSuffix.
   */
  com.google.protobuf.StringValue getFinalUrlSuffix();
  /**
   * <pre>
   * Final URL suffix to be appended to landing page URLs served with
   * parallel tracking.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 8;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlSuffixOrBuilder();
}
