// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/custom_parameter.proto

package com.google.ads.googleads.v1.common;

public final class CustomParameterProto {
  private CustomParameterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_CustomParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_CustomParameter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v1/common/custom_" +
      "parameter.proto\022\036google.ads.googleads.v1" +
      ".common\032\036google/protobuf/wrappers.proto\032" +
      "\034google/api/annotations.proto\"i\n\017CustomP" +
      "arameter\022)\n\003key\030\001 \001(\0132\034.google.protobuf." +
      "StringValue\022+\n\005value\030\002 \001(\0132\034.google.prot" +
      "obuf.StringValueB\357\001\n\"com.google.ads.goog" +
      "leads.v1.commonB\024CustomParameterProtoP\001Z" +
      "Dgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v1/common;common\242\002\003GAA\252\002\036Go" +
      "ogle.Ads.GoogleAds.V1.Common\312\002\036Google\\Ad" +
      "s\\GoogleAds\\V1\\Common\352\002\"Google::Ads::Goo" +
      "gleAds::V1::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_common_CustomParameter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_common_CustomParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_CustomParameter_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
