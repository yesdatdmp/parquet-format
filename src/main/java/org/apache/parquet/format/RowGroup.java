/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.parquet.format;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RowGroup implements org.apache.thrift.TBase<RowGroup, RowGroup._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RowGroup");

  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TOTAL_BYTE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("total_byte_size", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField NUM_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_rows", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField SORTING_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("sorting_columns", org.apache.thrift.protocol.TType.LIST, (short)4);

  public List<ColumnChunk> columns; // required
  /**
   * Total byte size of all the uncompressed column data in this row group *
   */
  public long total_byte_size; // required
  /**
   * Number of rows in this row group *
   */
  public long num_rows; // required
  /**
   * If set, specifies a sort ordering of the rows in this RowGroup.
   * The sorting columns can be a subset of all the columns.
   */
  public List<SortingColumn> sorting_columns; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMNS((short)1, "columns"),
    /**
     * Total byte size of all the uncompressed column data in this row group *
     */
    TOTAL_BYTE_SIZE((short)2, "total_byte_size"),
    /**
     * Number of rows in this row group *
     */
    NUM_ROWS((short)3, "num_rows"),
    /**
     * If set, specifies a sort ordering of the rows in this RowGroup.
     * The sorting columns can be a subset of all the columns.
     */
    SORTING_COLUMNS((short)4, "sorting_columns");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COLUMNS
          return COLUMNS;
        case 2: // TOTAL_BYTE_SIZE
          return TOTAL_BYTE_SIZE;
        case 3: // NUM_ROWS
          return NUM_ROWS;
        case 4: // SORTING_COLUMNS
          return SORTING_COLUMNS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TOTAL_BYTE_SIZE_ISSET_ID = 0;
  private static final int __NUM_ROWS_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnChunk.class))));
    tmpMap.put(_Fields.TOTAL_BYTE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("total_byte_size", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NUM_ROWS, new org.apache.thrift.meta_data.FieldMetaData("num_rows", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SORTING_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("sorting_columns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SortingColumn.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RowGroup.class, metaDataMap);
  }

  public RowGroup() {
  }

  public RowGroup(
    List<ColumnChunk> columns,
    long total_byte_size,
    long num_rows)
  {
    this();
    this.columns = columns;
    this.total_byte_size = total_byte_size;
    setTotal_byte_sizeIsSet(true);
    this.num_rows = num_rows;
    setNum_rowsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RowGroup(RowGroup other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetColumns()) {
      List<ColumnChunk> __this__columns = new ArrayList<ColumnChunk>();
      for (ColumnChunk other_element : other.columns) {
        __this__columns.add(new ColumnChunk(other_element));
      }
      this.columns = __this__columns;
    }
    this.total_byte_size = other.total_byte_size;
    this.num_rows = other.num_rows;
    if (other.isSetSorting_columns()) {
      List<SortingColumn> __this__sorting_columns = new ArrayList<SortingColumn>();
      for (SortingColumn other_element : other.sorting_columns) {
        __this__sorting_columns.add(new SortingColumn(other_element));
      }
      this.sorting_columns = __this__sorting_columns;
    }
  }

  public RowGroup deepCopy() {
    return new RowGroup(this);
  }

  @Override
  public void clear() {
    this.columns = null;
    setTotal_byte_sizeIsSet(false);
    this.total_byte_size = 0;
    setNum_rowsIsSet(false);
    this.num_rows = 0;
    this.sorting_columns = null;
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<ColumnChunk> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(ColumnChunk elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ColumnChunk>();
    }
    this.columns.add(elem);
  }

  public List<ColumnChunk> getColumns() {
    return this.columns;
  }

  public RowGroup setColumns(List<ColumnChunk> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  /**
   * Total byte size of all the uncompressed column data in this row group *
   */
  public long getTotal_byte_size() {
    return this.total_byte_size;
  }

  /**
   * Total byte size of all the uncompressed column data in this row group *
   */
  public RowGroup setTotal_byte_size(long total_byte_size) {
    this.total_byte_size = total_byte_size;
    setTotal_byte_sizeIsSet(true);
    return this;
  }

  public void unsetTotal_byte_size() {
    __isset_bit_vector.clear(__TOTAL_BYTE_SIZE_ISSET_ID);
  }

  /** Returns true if field total_byte_size is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal_byte_size() {
    return __isset_bit_vector.get(__TOTAL_BYTE_SIZE_ISSET_ID);
  }

  public void setTotal_byte_sizeIsSet(boolean value) {
    __isset_bit_vector.set(__TOTAL_BYTE_SIZE_ISSET_ID, value);
  }

  /**
   * Number of rows in this row group *
   */
  public long getNum_rows() {
    return this.num_rows;
  }

  /**
   * Number of rows in this row group *
   */
  public RowGroup setNum_rows(long num_rows) {
    this.num_rows = num_rows;
    setNum_rowsIsSet(true);
    return this;
  }

  public void unsetNum_rows() {
    __isset_bit_vector.clear(__NUM_ROWS_ISSET_ID);
  }

  /** Returns true if field num_rows is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_rows() {
    return __isset_bit_vector.get(__NUM_ROWS_ISSET_ID);
  }

  public void setNum_rowsIsSet(boolean value) {
    __isset_bit_vector.set(__NUM_ROWS_ISSET_ID, value);
  }

  public int getSorting_columnsSize() {
    return (this.sorting_columns == null) ? 0 : this.sorting_columns.size();
  }

  public java.util.Iterator<SortingColumn> getSorting_columnsIterator() {
    return (this.sorting_columns == null) ? null : this.sorting_columns.iterator();
  }

  public void addToSorting_columns(SortingColumn elem) {
    if (this.sorting_columns == null) {
      this.sorting_columns = new ArrayList<SortingColumn>();
    }
    this.sorting_columns.add(elem);
  }

  /**
   * If set, specifies a sort ordering of the rows in this RowGroup.
   * The sorting columns can be a subset of all the columns.
   */
  public List<SortingColumn> getSorting_columns() {
    return this.sorting_columns;
  }

  /**
   * If set, specifies a sort ordering of the rows in this RowGroup.
   * The sorting columns can be a subset of all the columns.
   */
  public RowGroup setSorting_columns(List<SortingColumn> sorting_columns) {
    this.sorting_columns = sorting_columns;
    return this;
  }

  public void unsetSorting_columns() {
    this.sorting_columns = null;
  }

  /** Returns true if field sorting_columns is set (has been assigned a value) and false otherwise */
  public boolean isSetSorting_columns() {
    return this.sorting_columns != null;
  }

  public void setSorting_columnsIsSet(boolean value) {
    if (!value) {
      this.sorting_columns = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<ColumnChunk>)value);
      }
      break;

    case TOTAL_BYTE_SIZE:
      if (value == null) {
        unsetTotal_byte_size();
      } else {
        setTotal_byte_size((Long)value);
      }
      break;

    case NUM_ROWS:
      if (value == null) {
        unsetNum_rows();
      } else {
        setNum_rows((Long)value);
      }
      break;

    case SORTING_COLUMNS:
      if (value == null) {
        unsetSorting_columns();
      } else {
        setSorting_columns((List<SortingColumn>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMNS:
      return getColumns();

    case TOTAL_BYTE_SIZE:
      return Long.valueOf(getTotal_byte_size());

    case NUM_ROWS:
      return Long.valueOf(getNum_rows());

    case SORTING_COLUMNS:
      return getSorting_columns();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COLUMNS:
      return isSetColumns();
    case TOTAL_BYTE_SIZE:
      return isSetTotal_byte_size();
    case NUM_ROWS:
      return isSetNum_rows();
    case SORTING_COLUMNS:
      return isSetSorting_columns();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RowGroup)
      return this.equals((RowGroup)that);
    return false;
  }

  public boolean equals(RowGroup that) {
    if (that == null)
      return false;

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_total_byte_size = true;
    boolean that_present_total_byte_size = true;
    if (this_present_total_byte_size || that_present_total_byte_size) {
      if (!(this_present_total_byte_size && that_present_total_byte_size))
        return false;
      if (this.total_byte_size != that.total_byte_size)
        return false;
    }

    boolean this_present_num_rows = true;
    boolean that_present_num_rows = true;
    if (this_present_num_rows || that_present_num_rows) {
      if (!(this_present_num_rows && that_present_num_rows))
        return false;
      if (this.num_rows != that.num_rows)
        return false;
    }

    boolean this_present_sorting_columns = true && this.isSetSorting_columns();
    boolean that_present_sorting_columns = true && that.isSetSorting_columns();
    if (this_present_sorting_columns || that_present_sorting_columns) {
      if (!(this_present_sorting_columns && that_present_sorting_columns))
        return false;
      if (!this.sorting_columns.equals(that.sorting_columns))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_columns = true && (isSetColumns());
    builder.append(present_columns);
    if (present_columns)
      builder.append(columns);

    boolean present_total_byte_size = true;
    builder.append(present_total_byte_size);
    if (present_total_byte_size)
      builder.append(total_byte_size);

    boolean present_num_rows = true;
    builder.append(present_num_rows);
    if (present_num_rows)
      builder.append(num_rows);

    boolean present_sorting_columns = true && (isSetSorting_columns());
    builder.append(present_sorting_columns);
    if (present_sorting_columns)
      builder.append(sorting_columns);

    return builder.toHashCode();
  }

  public int compareTo(RowGroup other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RowGroup typedOther = (RowGroup)other;

    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(typedOther.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, typedOther.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotal_byte_size()).compareTo(typedOther.isSetTotal_byte_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal_byte_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total_byte_size, typedOther.total_byte_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum_rows()).compareTo(typedOther.isSetNum_rows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_rows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_rows, typedOther.num_rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSorting_columns()).compareTo(typedOther.isSetSorting_columns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSorting_columns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sorting_columns, typedOther.sorting_columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // COLUMNS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list21 = iprot.readListBegin();
              this.columns = new ArrayList<ColumnChunk>(_list21.size);
              for (int _i22 = 0; _i22 < _list21.size; ++_i22)
              {
                ColumnChunk _elem23; // required
                _elem23 = new ColumnChunk();
                _elem23.read(iprot);
                this.columns.add(_elem23);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TOTAL_BYTE_SIZE
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.total_byte_size = iprot.readI64();
            setTotal_byte_sizeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // NUM_ROWS
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.num_rows = iprot.readI64();
            setNum_rowsIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SORTING_COLUMNS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
              this.sorting_columns = new ArrayList<SortingColumn>(_list24.size);
              for (int _i25 = 0; _i25 < _list24.size; ++_i25)
              {
                SortingColumn _elem26; // required
                _elem26 = new SortingColumn();
                _elem26.read(iprot);
                this.sorting_columns.add(_elem26);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetTotal_byte_size()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'total_byte_size' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetNum_rows()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_rows' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.columns != null) {
      oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.columns.size()));
        for (ColumnChunk _iter27 : this.columns)
        {
          _iter27.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(TOTAL_BYTE_SIZE_FIELD_DESC);
    oprot.writeI64(this.total_byte_size);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(NUM_ROWS_FIELD_DESC);
    oprot.writeI64(this.num_rows);
    oprot.writeFieldEnd();
    if (this.sorting_columns != null) {
      if (isSetSorting_columns()) {
        oprot.writeFieldBegin(SORTING_COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.sorting_columns.size()));
          for (SortingColumn _iter28 : this.sorting_columns)
          {
            _iter28.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RowGroup(");
    boolean first = true;

    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("total_byte_size:");
    sb.append(this.total_byte_size);
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_rows:");
    sb.append(this.num_rows);
    first = false;
    if (isSetSorting_columns()) {
      if (!first) sb.append(", ");
      sb.append("sorting_columns:");
      if (this.sorting_columns == null) {
        sb.append("null");
      } else {
        sb.append(this.sorting_columns);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (columns == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columns' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'total_byte_size' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'num_rows' because it's a primitive and you chose the non-beans generator.
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

