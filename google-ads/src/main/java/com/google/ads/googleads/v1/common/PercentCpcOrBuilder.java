// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/bidding.proto

package com.google.ads.googleads.v1.common;

public interface PercentCpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.PercentCpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy. This is
   * an optional field entered by the advertiser and specified in local micros.
   * Note: A zero value is interpreted in the same way as having bid_ceiling
   * undefined.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 1;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  boolean hasCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy. This is
   * an optional field entered by the advertiser and specified in local micros.
   * Note: A zero value is interpreted in the same way as having bid_ceiling
   * undefined.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 1;</code>
   * @return The cpcBidCeilingMicros.
   */
  com.google.protobuf.Int64Value getCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy. This is
   * an optional field entered by the advertiser and specified in local micros.
   * Note: A zero value is interpreted in the same way as having bid_ceiling
   * undefined.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidCeilingMicrosOrBuilder();

  /**
   * <pre>
   * Adjusts the bid for each auction upward or downward, depending on the
   * likelihood of a conversion. Individual bids may exceed
   * cpc_bid_ceiling_micros, but the average bid amount for a campaign should
   * not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 2;</code>
   * @return Whether the enhancedCpcEnabled field is set.
   */
  boolean hasEnhancedCpcEnabled();
  /**
   * <pre>
   * Adjusts the bid for each auction upward or downward, depending on the
   * likelihood of a conversion. Individual bids may exceed
   * cpc_bid_ceiling_micros, but the average bid amount for a campaign should
   * not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 2;</code>
   * @return The enhancedCpcEnabled.
   */
  com.google.protobuf.BoolValue getEnhancedCpcEnabled();
  /**
   * <pre>
   * Adjusts the bid for each auction upward or downward, depending on the
   * likelihood of a conversion. Individual bids may exceed
   * cpc_bid_ceiling_micros, but the average bid amount for a campaign should
   * not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 2;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEnhancedCpcEnabledOrBuilder();
}
