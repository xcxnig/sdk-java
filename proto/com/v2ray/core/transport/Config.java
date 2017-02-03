// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/config.proto

package com.v2ray.core.transport;

/**
 * <pre>
 * Global transport settings. This affects all type of connections that go through V2Ray.
 * </pre>
 *
 * Protobuf type {@code v2ray.core.transport.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.Config)
    ConfigOrBuilder {
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    transportSettings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Config(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              transportSettings_ = new java.util.ArrayList<com.v2ray.core.transport.internet.TransportConfig>();
              mutable_bitField0_ |= 0x00000001;
            }
            transportSettings_.add(
                input.readMessage(com.v2ray.core.transport.internet.TransportConfig.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        transportSettings_ = java.util.Collections.unmodifiableList(transportSettings_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.transport.ConfigOuterClass.internal_static_v2ray_core_transport_Config_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.ConfigOuterClass.internal_static_v2ray_core_transport_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.Config.class, com.v2ray.core.transport.Config.Builder.class);
  }

  public static final int TRANSPORT_SETTINGS_FIELD_NUMBER = 1;
  private java.util.List<com.v2ray.core.transport.internet.TransportConfig> transportSettings_;
  /**
   * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  public java.util.List<com.v2ray.core.transport.internet.TransportConfig> getTransportSettingsList() {
    return transportSettings_;
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  public java.util.List<? extends com.v2ray.core.transport.internet.TransportConfigOrBuilder> 
      getTransportSettingsOrBuilderList() {
    return transportSettings_;
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  public int getTransportSettingsCount() {
    return transportSettings_.size();
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  public com.v2ray.core.transport.internet.TransportConfig getTransportSettings(int index) {
    return transportSettings_.get(index);
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  public com.v2ray.core.transport.internet.TransportConfigOrBuilder getTransportSettingsOrBuilder(
      int index) {
    return transportSettings_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < transportSettings_.size(); i++) {
      output.writeMessage(1, transportSettings_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < transportSettings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, transportSettings_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.transport.Config)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.Config other = (com.v2ray.core.transport.Config) obj;

    boolean result = true;
    result = result && getTransportSettingsList()
        .equals(other.getTransportSettingsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getTransportSettingsCount() > 0) {
      hash = (37 * hash) + TRANSPORT_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getTransportSettingsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.Config parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.transport.Config prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Global transport settings. This affects all type of connections that go through V2Ray.
   * </pre>
   *
   * Protobuf type {@code v2ray.core.transport.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.Config)
      com.v2ray.core.transport.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.ConfigOuterClass.internal_static_v2ray_core_transport_Config_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.ConfigOuterClass.internal_static_v2ray_core_transport_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.Config.class, com.v2ray.core.transport.Config.Builder.class);
    }

    // Construct using com.v2ray.core.transport.Config.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTransportSettingsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (transportSettingsBuilder_ == null) {
        transportSettings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        transportSettingsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.ConfigOuterClass.internal_static_v2ray_core_transport_Config_descriptor;
    }

    public com.v2ray.core.transport.Config getDefaultInstanceForType() {
      return com.v2ray.core.transport.Config.getDefaultInstance();
    }

    public com.v2ray.core.transport.Config build() {
      com.v2ray.core.transport.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.transport.Config buildPartial() {
      com.v2ray.core.transport.Config result = new com.v2ray.core.transport.Config(this);
      int from_bitField0_ = bitField0_;
      if (transportSettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          transportSettings_ = java.util.Collections.unmodifiableList(transportSettings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.transportSettings_ = transportSettings_;
      } else {
        result.transportSettings_ = transportSettingsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.transport.Config) {
        return mergeFrom((com.v2ray.core.transport.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.Config other) {
      if (other == com.v2ray.core.transport.Config.getDefaultInstance()) return this;
      if (transportSettingsBuilder_ == null) {
        if (!other.transportSettings_.isEmpty()) {
          if (transportSettings_.isEmpty()) {
            transportSettings_ = other.transportSettings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTransportSettingsIsMutable();
            transportSettings_.addAll(other.transportSettings_);
          }
          onChanged();
        }
      } else {
        if (!other.transportSettings_.isEmpty()) {
          if (transportSettingsBuilder_.isEmpty()) {
            transportSettingsBuilder_.dispose();
            transportSettingsBuilder_ = null;
            transportSettings_ = other.transportSettings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            transportSettingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTransportSettingsFieldBuilder() : null;
          } else {
            transportSettingsBuilder_.addAllMessages(other.transportSettings_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.v2ray.core.transport.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.transport.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.v2ray.core.transport.internet.TransportConfig> transportSettings_ =
      java.util.Collections.emptyList();
    private void ensureTransportSettingsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        transportSettings_ = new java.util.ArrayList<com.v2ray.core.transport.internet.TransportConfig>(transportSettings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.transport.internet.TransportConfig, com.v2ray.core.transport.internet.TransportConfig.Builder, com.v2ray.core.transport.internet.TransportConfigOrBuilder> transportSettingsBuilder_;

    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public java.util.List<com.v2ray.core.transport.internet.TransportConfig> getTransportSettingsList() {
      if (transportSettingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(transportSettings_);
      } else {
        return transportSettingsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public int getTransportSettingsCount() {
      if (transportSettingsBuilder_ == null) {
        return transportSettings_.size();
      } else {
        return transportSettingsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public com.v2ray.core.transport.internet.TransportConfig getTransportSettings(int index) {
      if (transportSettingsBuilder_ == null) {
        return transportSettings_.get(index);
      } else {
        return transportSettingsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder setTransportSettings(
        int index, com.v2ray.core.transport.internet.TransportConfig value) {
      if (transportSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransportSettingsIsMutable();
        transportSettings_.set(index, value);
        onChanged();
      } else {
        transportSettingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder setTransportSettings(
        int index, com.v2ray.core.transport.internet.TransportConfig.Builder builderForValue) {
      if (transportSettingsBuilder_ == null) {
        ensureTransportSettingsIsMutable();
        transportSettings_.set(index, builderForValue.build());
        onChanged();
      } else {
        transportSettingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder addTransportSettings(com.v2ray.core.transport.internet.TransportConfig value) {
      if (transportSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransportSettingsIsMutable();
        transportSettings_.add(value);
        onChanged();
      } else {
        transportSettingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder addTransportSettings(
        int index, com.v2ray.core.transport.internet.TransportConfig value) {
      if (transportSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransportSettingsIsMutable();
        transportSettings_.add(index, value);
        onChanged();
      } else {
        transportSettingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder addTransportSettings(
        com.v2ray.core.transport.internet.TransportConfig.Builder builderForValue) {
      if (transportSettingsBuilder_ == null) {
        ensureTransportSettingsIsMutable();
        transportSettings_.add(builderForValue.build());
        onChanged();
      } else {
        transportSettingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder addTransportSettings(
        int index, com.v2ray.core.transport.internet.TransportConfig.Builder builderForValue) {
      if (transportSettingsBuilder_ == null) {
        ensureTransportSettingsIsMutable();
        transportSettings_.add(index, builderForValue.build());
        onChanged();
      } else {
        transportSettingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder addAllTransportSettings(
        java.lang.Iterable<? extends com.v2ray.core.transport.internet.TransportConfig> values) {
      if (transportSettingsBuilder_ == null) {
        ensureTransportSettingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, transportSettings_);
        onChanged();
      } else {
        transportSettingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder clearTransportSettings() {
      if (transportSettingsBuilder_ == null) {
        transportSettings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        transportSettingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder removeTransportSettings(int index) {
      if (transportSettingsBuilder_ == null) {
        ensureTransportSettingsIsMutable();
        transportSettings_.remove(index);
        onChanged();
      } else {
        transportSettingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public com.v2ray.core.transport.internet.TransportConfig.Builder getTransportSettingsBuilder(
        int index) {
      return getTransportSettingsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public com.v2ray.core.transport.internet.TransportConfigOrBuilder getTransportSettingsOrBuilder(
        int index) {
      if (transportSettingsBuilder_ == null) {
        return transportSettings_.get(index);  } else {
        return transportSettingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public java.util.List<? extends com.v2ray.core.transport.internet.TransportConfigOrBuilder> 
         getTransportSettingsOrBuilderList() {
      if (transportSettingsBuilder_ != null) {
        return transportSettingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(transportSettings_);
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public com.v2ray.core.transport.internet.TransportConfig.Builder addTransportSettingsBuilder() {
      return getTransportSettingsFieldBuilder().addBuilder(
          com.v2ray.core.transport.internet.TransportConfig.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public com.v2ray.core.transport.internet.TransportConfig.Builder addTransportSettingsBuilder(
        int index) {
      return getTransportSettingsFieldBuilder().addBuilder(
          index, com.v2ray.core.transport.internet.TransportConfig.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public java.util.List<com.v2ray.core.transport.internet.TransportConfig.Builder> 
         getTransportSettingsBuilderList() {
      return getTransportSettingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.transport.internet.TransportConfig, com.v2ray.core.transport.internet.TransportConfig.Builder, com.v2ray.core.transport.internet.TransportConfigOrBuilder> 
        getTransportSettingsFieldBuilder() {
      if (transportSettingsBuilder_ == null) {
        transportSettingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.transport.internet.TransportConfig, com.v2ray.core.transport.internet.TransportConfig.Builder, com.v2ray.core.transport.internet.TransportConfigOrBuilder>(
                transportSettings_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        transportSettings_ = null;
      }
      return transportSettingsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.Config)
  private static final com.v2ray.core.transport.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.Config();
  }

  public static com.v2ray.core.transport.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.transport.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
