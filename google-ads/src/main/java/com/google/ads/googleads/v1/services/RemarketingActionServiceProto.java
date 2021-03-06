// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/remarketing_action_service.proto

package com.google.ads.googleads.v1.services;

public final class RemarketingActionServiceProto {
  private RemarketingActionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetRemarketingActionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetRemarketingActionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_RemarketingActionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_RemarketingActionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateRemarketingActionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v1/services/remar" +
      "keting_action_service.proto\022 google.ads." +
      "googleads.v1.services\032:google/ads/google" +
      "ads/v1/resources/remarketing_action.prot" +
      "o\032\034google/api/annotations.proto\032\027google/" +
      "api/client.proto\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\032 go" +
      "ogle/protobuf/field_mask.proto\032\027google/r" +
      "pc/status.proto\"h\n\033GetRemarketingActionR" +
      "equest\022I\n\rresource_name\030\001 \001(\tB2\340A\002\372A,\n*g" +
      "oogleads.googleapis.com/RemarketingActio" +
      "n\"\302\001\n\037MutateRemarketingActionsRequest\022\030\n" +
      "\013customer_id\030\001 \001(\tB\003\340A\002\022U\n\noperations\030\002 " +
      "\003(\0132<.google.ads.googleads.v1.services.R" +
      "emarketingActionOperationB\003\340A\002\022\027\n\017partia" +
      "l_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\352" +
      "\001\n\032RemarketingActionOperation\022/\n\013update_" +
      "mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022F" +
      "\n\006create\030\001 \001(\01324.google.ads.googleads.v1" +
      ".resources.RemarketingActionH\000\022F\n\006update" +
      "\030\002 \001(\01324.google.ads.googleads.v1.resourc" +
      "es.RemarketingActionH\000B\013\n\toperation\"\247\001\n " +
      "MutateRemarketingActionsResponse\0221\n\025part" +
      "ial_failure_error\030\003 \001(\0132\022.google.rpc.Sta" +
      "tus\022P\n\007results\030\002 \003(\0132?.google.ads.google" +
      "ads.v1.services.MutateRemarketingActionR" +
      "esult\"6\n\035MutateRemarketingActionResult\022\025" +
      "\n\rresource_name\030\001 \001(\t2\224\004\n\030RemarketingAct" +
      "ionService\022\331\001\n\024GetRemarketingAction\022=.go" +
      "ogle.ads.googleads.v1.services.GetRemark" +
      "etingActionRequest\0324.google.ads.googlead" +
      "s.v1.resources.RemarketingAction\"L\202\323\344\223\0026" +
      "\0224/v1/{resource_name=customers/*/remarke" +
      "tingActions/*}\332A\rresource_name\022\376\001\n\030Mutat" +
      "eRemarketingActions\022A.google.ads.googlea" +
      "ds.v1.services.MutateRemarketingActionsR" +
      "equest\032B.google.ads.googleads.v1.service" +
      "s.MutateRemarketingActionsResponse\"[\202\323\344\223" +
      "\002<\"7/v1/customers/{customer_id=*}/remark" +
      "etingActions:mutate:\001*\332A\026customer_id,ope" +
      "rations\032\033\312A\030googleads.googleapis.comB\204\002\n" +
      "$com.google.ads.googleads.v1.servicesB\035R" +
      "emarketingActionServiceProtoP\001ZHgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v1/services;services\242\002\003GAA\252\002 Google." +
      "Ads.GoogleAds.V1.Services\312\002 Google\\Ads\\G" +
      "oogleAds\\V1\\Services\352\002$Google::Ads::Goog" +
      "leAds::V1::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.RemarketingActionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_services_GetRemarketingActionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetRemarketingActionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetRemarketingActionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_RemarketingActionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_RemarketingActionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_RemarketingActionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateRemarketingActionResult_descriptor,
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
    com.google.ads.googleads.v1.resources.RemarketingActionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
