// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/keyword_plan_keyword_service.proto

package com.google.ads.googleads.v1.services;

public final class KeywordPlanKeywordServiceProto {
  private KeywordPlanKeywordServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanKeywordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetKeywordPlanKeywordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_KeywordPlanKeywordOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_KeywordPlanKeywordOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v1/services/keywo" +
      "rd_plan_keyword_service.proto\022 google.ad" +
      "s.googleads.v1.services\032<google/ads/goog" +
      "leads/v1/resources/keyword_plan_keyword." +
      "proto\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032 google/protobuf/field_mask.proto\032\027goog" +
      "le/rpc/status.proto\"j\n\034GetKeywordPlanKey" +
      "wordRequest\022J\n\rresource_name\030\001 \001(\tB3\340A\002\372" +
      "A-\n+googleads.googleapis.com/KeywordPlan" +
      "Keyword\"\304\001\n MutateKeywordPlanKeywordsReq" +
      "uest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022V\n\noperat" +
      "ions\030\002 \003(\0132=.google.ads.googleads.v1.ser" +
      "vices.KeywordPlanKeywordOperationB\003\340A\002\022\027" +
      "\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_only" +
      "\030\004 \001(\010\"\377\001\n\033KeywordPlanKeywordOperation\022/" +
      "\n\013update_mask\030\004 \001(\0132\032.google.protobuf.Fi" +
      "eldMask\022G\n\006create\030\001 \001(\01325.google.ads.goo" +
      "gleads.v1.resources.KeywordPlanKeywordH\000" +
      "\022G\n\006update\030\002 \001(\01325.google.ads.googleads." +
      "v1.resources.KeywordPlanKeywordH\000\022\020\n\006rem" +
      "ove\030\003 \001(\tH\000B\013\n\toperation\"\251\001\n!MutateKeywo" +
      "rdPlanKeywordsResponse\0221\n\025partial_failur" +
      "e_error\030\003 \001(\0132\022.google.rpc.Status\022Q\n\007res" +
      "ults\030\002 \003(\0132@.google.ads.googleads.v1.ser" +
      "vices.MutateKeywordPlanKeywordResult\"7\n\036" +
      "MutateKeywordPlanKeywordResult\022\025\n\rresour" +
      "ce_name\030\001 \001(\t2\235\004\n\031KeywordPlanKeywordServ" +
      "ice\022\335\001\n\025GetKeywordPlanKeyword\022>.google.a" +
      "ds.googleads.v1.services.GetKeywordPlanK" +
      "eywordRequest\0325.google.ads.googleads.v1." +
      "resources.KeywordPlanKeyword\"M\202\323\344\223\0027\0225/v" +
      "1/{resource_name=customers/*/keywordPlan" +
      "Keywords/*}\332A\rresource_name\022\202\002\n\031MutateKe" +
      "ywordPlanKeywords\022B.google.ads.googleads" +
      ".v1.services.MutateKeywordPlanKeywordsRe" +
      "quest\032C.google.ads.googleads.v1.services" +
      ".MutateKeywordPlanKeywordsResponse\"\\\202\323\344\223" +
      "\002=\"8/v1/customers/{customer_id=*}/keywor" +
      "dPlanKeywords:mutate:\001*\332A\026customer_id,op" +
      "erations\032\033\312A\030googleads.googleapis.comB\205\002" +
      "\n$com.google.ads.googleads.v1.servicesB\036" +
      "KeywordPlanKeywordServiceProtoP\001ZHgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v1/services;services\242\002\003GAA\252\002 Googl" +
      "e.Ads.GoogleAds.V1.Services\312\002 Google\\Ads" +
      "\\GoogleAds\\V1\\Services\352\002$Google::Ads::Go" +
      "ogleAds::V1::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.KeywordPlanKeywordProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanKeywordRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanKeywordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetKeywordPlanKeywordRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_KeywordPlanKeywordOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_KeywordPlanKeywordOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_KeywordPlanKeywordOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanKeywordResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.KeywordPlanKeywordProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
