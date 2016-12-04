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
public final class Timeline_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.loan.Timeline_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> loanId = new Property<Integer>(Timeline.class, "loanId");

  public static final Property<Integer> actualDisburseDate_loanId = new Property<Integer>(Timeline.class, "actualDisburseDate_loanId");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{loanId,actualDisburseDate_loanId};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`loanId`":  {
        return loanId;
      }
      case "`actualDisburseDate_loanId`":  {
        return actualDisburseDate_loanId;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
