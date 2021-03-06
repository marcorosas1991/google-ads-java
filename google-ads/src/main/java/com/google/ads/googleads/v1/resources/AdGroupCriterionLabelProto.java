// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/ad_group_criterion_label.proto

package com.google.ads.googleads.v1.resources;

public final class AdGroupCriterionLabelProto {
  private AdGroupCriterionLabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterionLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_AdGroupCriterionLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v1/resources/ad_g" +
      "roup_criterion_label.proto\022!google.ads.g" +
      "oogleads.v1.resources\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\032\036google/protobuf/wrappers.proto\032\034googl" +
      "e/api/annotations.proto\"\245\003\n\025AdGroupCrite" +
      "rionLabel\022M\n\rresource_name\030\001 \001(\tB6\340A\005\372A0" +
      "\n.googleads.googleapis.com/AdGroupCriter" +
      "ionLabel\022k\n\022ad_group_criterion\030\002 \001(\0132\034.g" +
      "oogle.protobuf.StringValueB1\340A\005\372A+\n)goog" +
      "leads.googleapis.com/AdGroupCriterion\022S\n" +
      "\005label\030\003 \001(\0132\034.google.protobuf.StringVal" +
      "ueB&\340A\005\372A \n\036googleads.googleapis.com/Lab" +
      "el:{\352Ax\n.googleads.googleapis.com/AdGrou" +
      "pCriterionLabel\022Fcustomers/{customer}/ad" +
      "GroupCriterionLabels/{ad_group_criterion" +
      "_label}B\207\002\n%com.google.ads.googleads.v1." +
      "resourcesB\032AdGroupCriterionLabelProtoP\001Z" +
      "Jgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v1/resources;resources\242\002\003GA" +
      "A\252\002!Google.Ads.GoogleAds.V1.Resources\312\002!" +
      "Google\\Ads\\GoogleAds\\V1\\Resources\352\002%Goog" +
      "le::Ads::GoogleAds::V1::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterionLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterionLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_AdGroupCriterionLabel_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", "Label", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
