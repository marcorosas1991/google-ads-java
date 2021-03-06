// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_budget_service.proto

package com.google.ads.googleads.v2.services;

public final class CampaignBudgetServiceProto {
  private CampaignBudgetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetCampaignBudgetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetCampaignBudgetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_CampaignBudgetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_CampaignBudgetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v2/services/campa" +
      "ign_budget_service.proto\022 google.ads.goo" +
      "gleads.v2.services\0327google/ads/googleads" +
      "/v2/resources/campaign_budget.proto\032\034goo" +
      "gle/api/annotations.proto\032\027google/api/cl" +
      "ient.proto\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\032 google/p" +
      "rotobuf/field_mask.proto\032\027google/rpc/sta" +
      "tus.proto\"b\n\030GetCampaignBudgetRequest\022F\n" +
      "\rresource_name\030\001 \001(\tB/\340A\002\372A)\n\'googleads." +
      "googleapis.com/CampaignBudget\"\274\001\n\034Mutate" +
      "CampaignBudgetsRequest\022\030\n\013customer_id\030\001 " +
      "\001(\tB\003\340A\002\022R\n\noperations\030\002 \003(\01329.google.ad" +
      "s.googleads.v2.services.CampaignBudgetOp" +
      "erationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n" +
      "\rvalidate_only\030\004 \001(\010\"\363\001\n\027CampaignBudgetO" +
      "peration\022/\n\013update_mask\030\004 \001(\0132\032.google.p" +
      "rotobuf.FieldMask\022C\n\006create\030\001 \001(\01321.goog" +
      "le.ads.googleads.v2.resources.CampaignBu" +
      "dgetH\000\022C\n\006update\030\002 \001(\01321.google.ads.goog" +
      "leads.v2.resources.CampaignBudgetH\000\022\020\n\006r" +
      "emove\030\003 \001(\tH\000B\013\n\toperation\"\241\001\n\035MutateCam" +
      "paignBudgetsResponse\0221\n\025partial_failure_" +
      "error\030\003 \001(\0132\022.google.rpc.Status\022M\n\007resul" +
      "ts\030\002 \003(\0132<.google.ads.googleads.v2.servi" +
      "ces.MutateCampaignBudgetResult\"3\n\032Mutate" +
      "CampaignBudgetResult\022\025\n\rresource_name\030\001 " +
      "\001(\t2\371\003\n\025CampaignBudgetService\022\315\001\n\021GetCam" +
      "paignBudget\022:.google.ads.googleads.v2.se" +
      "rvices.GetCampaignBudgetRequest\0321.google" +
      ".ads.googleads.v2.resources.CampaignBudg" +
      "et\"I\202\323\344\223\0023\0221/v2/{resource_name=customers" +
      "/*/campaignBudgets/*}\332A\rresource_name\022\362\001" +
      "\n\025MutateCampaignBudgets\022>.google.ads.goo" +
      "gleads.v2.services.MutateCampaignBudgets" +
      "Request\032?.google.ads.googleads.v2.servic" +
      "es.MutateCampaignBudgetsResponse\"X\202\323\344\223\0029" +
      "\"4/v2/customers/{customer_id=*}/campaign" +
      "Budgets:mutate:\001*\332A\026customer_id,operatio" +
      "ns\032\033\312A\030googleads.googleapis.comB\201\002\n$com." +
      "google.ads.googleads.v2.servicesB\032Campai" +
      "gnBudgetServiceProtoP\001ZHgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v2/s" +
      "ervices;services\242\002\003GAA\252\002 Google.Ads.Goog" +
      "leAds.V2.Services\312\002 Google\\Ads\\GoogleAds" +
      "\\V2\\Services\352\002$Google::Ads::GoogleAds::V" +
      "2::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.resources.CampaignBudgetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_services_GetCampaignBudgetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetCampaignBudgetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetCampaignBudgetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_CampaignBudgetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_CampaignBudgetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_CampaignBudgetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignBudgetResult_descriptor,
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
    com.google.ads.googleads.v2.resources.CampaignBudgetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
