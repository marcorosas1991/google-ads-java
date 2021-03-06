// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/feed_item.proto

package com.google.ads.googleads.v1.resources;

public final class FeedItemProto {
  private FeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_FeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_FeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_FeedItemAttributeValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_FeedItemAttributeValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_FeedItemPlaceholderPolicyInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_FeedItemPlaceholderPolicyInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_FeedItemValidationError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_FeedItemValidationError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v1/resources/feed" +
      "_item.proto\022!google.ads.googleads.v1.res" +
      "ources\0325google/ads/googleads/v1/common/c" +
      "ustom_parameter.proto\0320google/ads/google" +
      "ads/v1/common/feed_common.proto\032+google/" +
      "ads/googleads/v1/common/policy.proto\032Ego" +
      "ogle/ads/googleads/v1/enums/feed_item_qu" +
      "ality_approval_status.proto\032Hgoogle/ads/" +
      "googleads/v1/enums/feed_item_quality_dis" +
      "approval_reason.proto\0324google/ads/google" +
      "ads/v1/enums/feed_item_status.proto\032?goo" +
      "gle/ads/googleads/v1/enums/feed_item_val" +
      "idation_status.proto\032=google/ads/googlea" +
      "ds/v1/enums/geo_targeting_restriction.pr" +
      "oto\032:google/ads/googleads/v1/enums/polic" +
      "y_approval_status.proto\0328google/ads/goog" +
      "leads/v1/enums/policy_review_status.prot" +
      "o\032?google/ads/googleads/v1/errors/feed_i" +
      "tem_validation_error.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032\036google/protobuf/wrappers.proto\032\034" +
      "google/api/annotations.proto\"\335\006\n\010FeedIte" +
      "m\022@\n\rresource_name\030\001 \001(\tB)\340A\005\372A#\n!google" +
      "ads.googleapis.com/FeedItem\022Q\n\004feed\030\002 \001(" +
      "\0132\034.google.protobuf.StringValueB%\340A\005\372A\037\n" +
      "\035googleads.googleapis.com/Feed\022,\n\002id\030\003 \001" +
      "(\0132\033.google.protobuf.Int64ValueB\003\340A\003\0225\n\017" +
      "start_date_time\030\004 \001(\0132\034.google.protobuf." +
      "StringValue\0223\n\rend_date_time\030\005 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022S\n\020attribute_va" +
      "lues\030\006 \003(\01329.google.ads.googleads.v1.res" +
      "ources.FeedItemAttributeValue\022u\n\031geo_tar" +
      "geting_restriction\030\007 \001(\0162R.google.ads.go" +
      "ogleads.v1.enums.GeoTargetingRestriction" +
      "Enum.GeoTargetingRestriction\022N\n\025url_cust" +
      "om_parameters\030\010 \003(\0132/.google.ads.googlea" +
      "ds.v1.common.CustomParameter\022U\n\006status\030\t" +
      " \001(\0162@.google.ads.googleads.v1.enums.Fee" +
      "dItemStatusEnum.FeedItemStatusB\003\340A\003\022[\n\014p" +
      "olicy_infos\030\n \003(\0132@.google.ads.googleads" +
      ".v1.resources.FeedItemPlaceholderPolicyI" +
      "nfoB\003\340A\003:R\352AO\n!googleads.googleapis.com/" +
      "FeedItem\022*customers/{customer}/feedItems" +
      "/{feed_item}\"\256\004\n\026FeedItemAttributeValue\022" +
      "6\n\021feed_attribute_id\030\001 \001(\0132\033.google.prot" +
      "obuf.Int64Value\0222\n\rinteger_value\030\002 \001(\0132\033" +
      ".google.protobuf.Int64Value\0221\n\rboolean_v" +
      "alue\030\003 \001(\0132\032.google.protobuf.BoolValue\0222" +
      "\n\014string_value\030\004 \001(\0132\034.google.protobuf.S" +
      "tringValue\0222\n\014double_value\030\005 \001(\0132\034.googl" +
      "e.protobuf.DoubleValue\022:\n\013price_value\030\006 " +
      "\001(\0132%.google.ads.googleads.v1.common.Mon" +
      "ey\0223\n\016integer_values\030\007 \003(\0132\033.google.prot" +
      "obuf.Int64Value\0222\n\016boolean_values\030\010 \003(\0132" +
      "\032.google.protobuf.BoolValue\0223\n\rstring_va" +
      "lues\030\t \003(\0132\034.google.protobuf.StringValue" +
      "\0223\n\rdouble_values\030\n \003(\0132\034.google.protobu" +
      "f.DoubleValue\"\263\007\n\035FeedItemPlaceholderPol" +
      "icyInfo\022:\n\020placeholder_type\030\001 \001(\0132\033.goog" +
      "le.protobuf.Int32ValueB\003\340A\003\022E\n\032feed_mapp" +
      "ing_resource_name\030\002 \001(\0132\034.google.protobu" +
      "f.StringValueB\003\340A\003\022d\n\rreview_status\030\003 \001(" +
      "\0162H.google.ads.googleads.v1.enums.Policy" +
      "ReviewStatusEnum.PolicyReviewStatusB\003\340A\003" +
      "\022j\n\017approval_status\030\004 \001(\0162L.google.ads.g" +
      "oogleads.v1.enums.PolicyApprovalStatusEn" +
      "um.PolicyApprovalStatusB\003\340A\003\022S\n\024policy_t" +
      "opic_entries\030\005 \003(\01320.google.ads.googlead" +
      "s.v1.common.PolicyTopicEntryB\003\340A\003\022t\n\021val" +
      "idation_status\030\006 \001(\0162T.google.ads.google" +
      "ads.v1.enums.FeedItemValidationStatusEnu" +
      "m.FeedItemValidationStatusB\003\340A\003\022Z\n\021valid" +
      "ation_errors\030\007 \003(\0132:.google.ads.googlead" +
      "s.v1.resources.FeedItemValidationErrorB\003" +
      "\340A\003\022\204\001\n\027quality_approval_status\030\010 \001(\0162^." +
      "google.ads.googleads.v1.enums.FeedItemQu" +
      "alityApprovalStatusEnum.FeedItemQualityA" +
      "pprovalStatusB\003\340A\003\022\216\001\n\033quality_disapprov" +
      "al_reasons\030\t \003(\0162d.google.ads.googleads." +
      "v1.enums.FeedItemQualityDisapprovalReaso" +
      "nEnum.FeedItemQualityDisapprovalReasonB\003" +
      "\340A\003\"\272\002\n\027FeedItemValidationError\022r\n\020valid" +
      "ation_error\030\001 \001(\0162S.google.ads.googleads" +
      ".v1.errors.FeedItemValidationErrorEnum.F" +
      "eedItemValidationErrorB\003\340A\003\0226\n\013descripti" +
      "on\030\002 \001(\0132\034.google.protobuf.StringValueB\003" +
      "\340A\003\022<\n\022feed_attribute_ids\030\003 \003(\0132\033.google" +
      ".protobuf.Int64ValueB\003\340A\003\0225\n\nextra_info\030" +
      "\005 \001(\0132\034.google.protobuf.StringValueB\003\340A\003" +
      "B\372\001\n%com.google.ads.googleads.v1.resourc" +
      "esB\rFeedItemProtoP\001ZJgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v1/reso" +
      "urces;resources\242\002\003GAA\252\002!Google.Ads.Googl" +
      "eAds.V1.Resources\312\002!Google\\Ads\\GoogleAds" +
      "\\V1\\Resources\352\002%Google::Ads::GoogleAds::" +
      "V1::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v1.common.FeedCommonProto.getDescriptor(),
          com.google.ads.googleads.v1.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemQualityApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemQualityDisapprovalReasonProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemValidationStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.GeoTargetingRestrictionProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.errors.FeedItemValidationErrorProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_resources_FeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_FeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_FeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "Id", "StartDateTime", "EndDateTime", "AttributeValues", "GeoTargetingRestriction", "UrlCustomParameters", "Status", "PolicyInfos", });
    internal_static_google_ads_googleads_v1_resources_FeedItemAttributeValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_resources_FeedItemAttributeValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_FeedItemAttributeValue_descriptor,
        new java.lang.String[] { "FeedAttributeId", "IntegerValue", "BooleanValue", "StringValue", "DoubleValue", "PriceValue", "IntegerValues", "BooleanValues", "StringValues", "DoubleValues", });
    internal_static_google_ads_googleads_v1_resources_FeedItemPlaceholderPolicyInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_resources_FeedItemPlaceholderPolicyInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_FeedItemPlaceholderPolicyInfo_descriptor,
        new java.lang.String[] { "PlaceholderType", "FeedMappingResourceName", "ReviewStatus", "ApprovalStatus", "PolicyTopicEntries", "ValidationStatus", "ValidationErrors", "QualityApprovalStatus", "QualityDisapprovalReasons", });
    internal_static_google_ads_googleads_v1_resources_FeedItemValidationError_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_resources_FeedItemValidationError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_FeedItemValidationError_descriptor,
        new java.lang.String[] { "ValidationError", "Description", "FeedAttributeIds", "ExtraInfo", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v1.common.FeedCommonProto.getDescriptor();
    com.google.ads.googleads.v1.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemQualityApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemQualityDisapprovalReasonProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemValidationStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.GeoTargetingRestrictionProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.ads.googleads.v1.errors.FeedItemValidationErrorProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
