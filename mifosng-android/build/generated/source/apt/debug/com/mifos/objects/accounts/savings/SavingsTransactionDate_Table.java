package com.mifos.objects.accounts.savings;

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
public final class SavingsTransactionDate_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.savings.SavingsTransactionDate_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> transactionId = new Property<Integer>(SavingsTransactionDate.class, "transactionId");

  public static final Property<Integer> year = new Property<Integer>(SavingsTransactionDate.class, "year");

  public static final Property<Integer> month = new Property<Integer>(SavingsTransactionDate.class, "month");

  public static final Property<Integer> day = new Property<Integer>(SavingsTransactionDate.class, "day");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{transactionId,year,month,day};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`transactionId`":  {
        return transactionId;
      }
      case "`year`":  {
        return year;
      }
      case "`month`":  {
        return month;
      }
      case "`day`":  {
        return day;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
