package com.mifos.objects.client;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Currency_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.client.Currency_Table.getProperty(columnName); 
  }
  };

  public static final Property<String> code = new Property<String>(Currency.class, "code");

  public static final Property<String> name = new Property<String>(Currency.class, "name");

  public static final Property<Integer> decimalPlaces = new Property<Integer>(Currency.class, "decimalPlaces");

  public static final Property<Integer> inMultiplesOf = new Property<Integer>(Currency.class, "inMultiplesOf");

  public static final Property<String> displaySymbol = new Property<String>(Currency.class, "displaySymbol");

  public static final Property<String> nameCode = new Property<String>(Currency.class, "nameCode");

  public static final Property<String> displayLabel = new Property<String>(Currency.class, "displayLabel");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{code,name,decimalPlaces,inMultiplesOf,displaySymbol,nameCode,displayLabel};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`code`":  {
        return code;
      }
      case "`name`":  {
        return name;
      }
      case "`decimalPlaces`":  {
        return decimalPlaces;
      }
      case "`inMultiplesOf`":  {
        return inMultiplesOf;
      }
      case "`displaySymbol`":  {
        return displaySymbol;
      }
      case "`nameCode`":  {
        return nameCode;
      }
      case "`displayLabel`":  {
        return displayLabel;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
