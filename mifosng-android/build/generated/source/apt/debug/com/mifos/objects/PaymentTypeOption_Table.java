package com.mifos.objects;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class PaymentTypeOption_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.PaymentTypeOption_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(PaymentTypeOption.class, "id");

  public static final Property<String> name = new Property<String>(PaymentTypeOption.class, "name");

  public static final Property<String> description = new Property<String>(PaymentTypeOption.class, "description");

  public static final Property<Boolean> isCashPayment = new Property<Boolean>(PaymentTypeOption.class, "isCashPayment");

  public static final Property<Integer> position = new Property<Integer>(PaymentTypeOption.class, "position");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,name,description,isCashPayment,position};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`name`":  {
        return name;
      }
      case "`description`":  {
        return description;
      }
      case "`isCashPayment`":  {
        return isCashPayment;
      }
      case "`position`":  {
        return position;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
