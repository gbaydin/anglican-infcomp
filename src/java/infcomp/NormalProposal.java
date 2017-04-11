// automatically generated by the FlatBuffers compiler, do not modify

package infcomp;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class NormalProposal extends Table {
  public static NormalProposal getRootAsNormalProposal(ByteBuffer _bb) { return getRootAsNormalProposal(_bb, new NormalProposal()); }
  public static NormalProposal getRootAsNormalProposal(ByteBuffer _bb, NormalProposal obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public NormalProposal __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public double mean() { int o = __offset(4); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double std() { int o = __offset(6); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }

  public static int createNormalProposal(FlatBufferBuilder builder,
      double mean,
      double std) {
    builder.startObject(2);
    NormalProposal.addStd(builder, std);
    NormalProposal.addMean(builder, mean);
    return NormalProposal.endNormalProposal(builder);
  }

  public static void startNormalProposal(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addMean(FlatBufferBuilder builder, double mean) { builder.addDouble(0, mean, 0.0); }
  public static void addStd(FlatBufferBuilder builder, double std) { builder.addDouble(1, std, 0.0); }
  public static int endNormalProposal(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

