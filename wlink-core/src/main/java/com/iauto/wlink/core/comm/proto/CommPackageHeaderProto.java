// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wlink/CommPackageHeaderProto.proto

package com.iauto.wlink.core.comm.proto;

public final class CommPackageHeaderProto {
  private CommPackageHeaderProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CommPackageHeaderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.iauto.wlink.core.comm.proto.CommPackageHeader)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string type = 1 [default = ""];</code>
     */
    boolean hasType();
    /**
     * <code>required string type = 1 [default = ""];</code>
     */
    java.lang.String getType();
    /**
     * <code>required string type = 1 [default = ""];</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>required uint32 headerLength = 2 [default = 0];</code>
     */
    boolean hasHeaderLength();
    /**
     * <code>required uint32 headerLength = 2 [default = 0];</code>
     */
    int getHeaderLength();

    /**
     * <code>required uint32 contentLength = 3 [default = 0];</code>
     */
    boolean hasContentLength();
    /**
     * <code>required uint32 contentLength = 3 [default = 0];</code>
     */
    int getContentLength();
  }
  /**
   * Protobuf type {@code com.iauto.wlink.core.comm.proto.CommPackageHeader}
   */
  public static final class CommPackageHeader extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.iauto.wlink.core.comm.proto.CommPackageHeader)
      CommPackageHeaderOrBuilder {
    // Use CommPackageHeader.newBuilder() to construct.
    private CommPackageHeader(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CommPackageHeader(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CommPackageHeader defaultInstance;
    public static CommPackageHeader getDefaultInstance() {
      return defaultInstance;
    }

    public CommPackageHeader getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CommPackageHeader(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              type_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              headerLength_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              contentLength_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.internal_static_com_iauto_wlink_core_comm_proto_CommPackageHeader_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.internal_static_com_iauto_wlink_core_comm_proto_CommPackageHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader.class, com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader.Builder.class);
    }

    public static com.google.protobuf.Parser<CommPackageHeader> PARSER =
        new com.google.protobuf.AbstractParser<CommPackageHeader>() {
      public CommPackageHeader parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CommPackageHeader(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CommPackageHeader> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private java.lang.Object type_;
    /**
     * <code>required string type = 1 [default = ""];</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string type = 1 [default = ""];</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string type = 1 [default = ""];</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HEADERLENGTH_FIELD_NUMBER = 2;
    private int headerLength_;
    /**
     * <code>required uint32 headerLength = 2 [default = 0];</code>
     */
    public boolean hasHeaderLength() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 headerLength = 2 [default = 0];</code>
     */
    public int getHeaderLength() {
      return headerLength_;
    }

    public static final int CONTENTLENGTH_FIELD_NUMBER = 3;
    private int contentLength_;
    /**
     * <code>required uint32 contentLength = 3 [default = 0];</code>
     */
    public boolean hasContentLength() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint32 contentLength = 3 [default = 0];</code>
     */
    public int getContentLength() {
      return contentLength_;
    }

    private void initFields() {
      type_ = "";
      headerLength_ = 0;
      contentLength_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHeaderLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasContentLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTypeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, headerLength_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, contentLength_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTypeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, headerLength_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, contentLength_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.iauto.wlink.core.comm.proto.CommPackageHeader}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.iauto.wlink.core.comm.proto.CommPackageHeader)
        com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.internal_static_com_iauto_wlink_core_comm_proto_CommPackageHeader_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.internal_static_com_iauto_wlink_core_comm_proto_CommPackageHeader_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader.class, com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader.Builder.class);
      }

      // Construct using com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        headerLength_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        contentLength_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.internal_static_com_iauto_wlink_core_comm_proto_CommPackageHeader_descriptor;
      }

      public com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader getDefaultInstanceForType() {
        return com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader.getDefaultInstance();
      }

      public com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader build() {
        com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader buildPartial() {
        com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader result = new com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.headerLength_ = headerLength_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.contentLength_ = contentLength_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader) {
          return mergeFrom((com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader other) {
        if (other == com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader.getDefaultInstance()) return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasHeaderLength()) {
          setHeaderLength(other.getHeaderLength());
        }
        if (other.hasContentLength()) {
          setContentLength(other.getContentLength());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasHeaderLength()) {
          
          return false;
        }
        if (!hasContentLength()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.iauto.wlink.core.comm.proto.CommPackageHeaderProto.CommPackageHeader) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       * <code>required string type = 1 [default = ""];</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string type = 1 [default = ""];</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string type = 1 [default = ""];</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string type = 1 [default = ""];</code>
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string type = 1 [default = ""];</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>required string type = 1 [default = ""];</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private int headerLength_ ;
      /**
       * <code>required uint32 headerLength = 2 [default = 0];</code>
       */
      public boolean hasHeaderLength() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 headerLength = 2 [default = 0];</code>
       */
      public int getHeaderLength() {
        return headerLength_;
      }
      /**
       * <code>required uint32 headerLength = 2 [default = 0];</code>
       */
      public Builder setHeaderLength(int value) {
        bitField0_ |= 0x00000002;
        headerLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 headerLength = 2 [default = 0];</code>
       */
      public Builder clearHeaderLength() {
        bitField0_ = (bitField0_ & ~0x00000002);
        headerLength_ = 0;
        onChanged();
        return this;
      }

      private int contentLength_ ;
      /**
       * <code>required uint32 contentLength = 3 [default = 0];</code>
       */
      public boolean hasContentLength() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint32 contentLength = 3 [default = 0];</code>
       */
      public int getContentLength() {
        return contentLength_;
      }
      /**
       * <code>required uint32 contentLength = 3 [default = 0];</code>
       */
      public Builder setContentLength(int value) {
        bitField0_ |= 0x00000004;
        contentLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 contentLength = 3 [default = 0];</code>
       */
      public Builder clearContentLength() {
        bitField0_ = (bitField0_ & ~0x00000004);
        contentLength_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.iauto.wlink.core.comm.proto.CommPackageHeader)
    }

    static {
      defaultInstance = new CommPackageHeader(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.iauto.wlink.core.comm.proto.CommPackageHeader)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_iauto_wlink_core_comm_proto_CommPackageHeader_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_iauto_wlink_core_comm_proto_CommPackageHeader_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"wlink/CommPackageHeaderProto.proto\022\037co" +
      "m.iauto.wlink.core.comm.proto\"V\n\021CommPac" +
      "kageHeader\022\016\n\004type\030\001 \002(\t:\000\022\027\n\014headerLeng" +
      "th\030\002 \002(\r:\0010\022\030\n\rcontentLength\030\003 \002(\r:\0010"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_iauto_wlink_core_comm_proto_CommPackageHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_iauto_wlink_core_comm_proto_CommPackageHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_iauto_wlink_core_comm_proto_CommPackageHeader_descriptor,
        new java.lang.String[] { "Type", "HeaderLength", "ContentLength", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}