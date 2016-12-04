package com.mifos.objects.accounts.savings;

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
public final class TransactionType_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.savings.TransactionType_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(TransactionType.class, "id");

  public static final Property<Boolean> deposit = new Property<Boolean>(TransactionType.class, "deposit");

  public static final Property<Boolean> withdrawal = new Property<Boolean>(TransactionType.class, "withdrawal");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,deposit,withdrawal};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`deposit`":  {
        return deposit;
      }
      case "`withdrawal`":  {
        return withdrawal;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
