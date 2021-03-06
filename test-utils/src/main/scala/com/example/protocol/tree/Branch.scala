// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.example.protocol.tree



@SerialVersionUID(0L)
final case class Branch(
    left: scala.Option[com.example.protocol.tree.BinaryTree] = None,
    right: scala.Option[com.example.protocol.tree.BinaryTree] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Branch] with com.trueaccord.lenses.Updatable[Branch] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (left.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(left.get.serializedSize) + left.get.serializedSize }
      if (right.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(right.get.serializedSize) + right.get.serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      left.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      right.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.example.protocol.tree.Branch = {
      var __left = this.left
      var __right = this.right
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __left = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __left.getOrElse(com.example.protocol.tree.BinaryTree.defaultInstance)))
          case 18 =>
            __right = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __right.getOrElse(com.example.protocol.tree.BinaryTree.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.example.protocol.tree.Branch(
          left = __left,
          right = __right
      )
    }
    def getLeft: com.example.protocol.tree.BinaryTree = left.getOrElse(com.example.protocol.tree.BinaryTree.defaultInstance)
    def clearLeft: Branch = copy(left = None)
    def withLeft(__v: com.example.protocol.tree.BinaryTree): Branch = copy(left = Some(__v))
    def getRight: com.example.protocol.tree.BinaryTree = right.getOrElse(com.example.protocol.tree.BinaryTree.defaultInstance)
    def clearRight: Branch = copy(right = None)
    def withRight(__v: com.example.protocol.tree.BinaryTree): Branch = copy(right = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => left.orNull
        case 2 => right.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => left.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => right.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.example.protocol.tree.Branch
}

object Branch extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.example.protocol.tree.Branch] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.example.protocol.tree.Branch] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.example.protocol.tree.Branch = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.example.protocol.tree.Branch(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[com.example.protocol.tree.BinaryTree]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[com.example.protocol.tree.BinaryTree]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.example.protocol.tree.Branch] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.example.protocol.tree.Branch(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[com.example.protocol.tree.BinaryTree]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[com.example.protocol.tree.BinaryTree]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TreeProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TreeProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = com.example.protocol.tree.BinaryTree
      case 2 => __out = com.example.protocol.tree.BinaryTree
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.example.protocol.tree.Branch(
  )
  implicit class BranchLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.example.protocol.tree.Branch]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.example.protocol.tree.Branch](_l) {
    def left: _root_.com.trueaccord.lenses.Lens[UpperPB, com.example.protocol.tree.BinaryTree] = field(_.getLeft)((c_, f_) => c_.copy(left = Some(f_)))
    def optionalLeft: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.example.protocol.tree.BinaryTree]] = field(_.left)((c_, f_) => c_.copy(left = f_))
    def right: _root_.com.trueaccord.lenses.Lens[UpperPB, com.example.protocol.tree.BinaryTree] = field(_.getRight)((c_, f_) => c_.copy(right = Some(f_)))
    def optionalRight: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.example.protocol.tree.BinaryTree]] = field(_.right)((c_, f_) => c_.copy(right = f_))
  }
  final val LEFT_FIELD_NUMBER = 1
  final val RIGHT_FIELD_NUMBER = 2
}
