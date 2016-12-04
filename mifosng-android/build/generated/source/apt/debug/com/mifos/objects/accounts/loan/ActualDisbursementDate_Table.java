package com.mifos.objects.accounts.loan;

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
public final class ActualDisbursementDate_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.loan.ActualDisbursementDate_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> loanId = new Property<Integer>(ActualDisbursementDate.class, "loanId");

  public static final Property<Integer> year = new Property<Integer>(ActualDisbursementDate.class, "year");

  public static final Property<Integer> month = new Property<Integer>(ActualDisbursementDate.class, "month");

  public static final Property<Integer> date = new Property<Integer>(ActualDisbursementDate.class, "date");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{loanId,year,month,date};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`loanId`":  {
        return loanId;
      }
      case "`year`":  {
        return year;
      }
      case "`month`":  {
        return month;
      }
      case "`date`":  {
        return date;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
