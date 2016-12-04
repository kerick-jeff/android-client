package com.mifos.objects.templates.savings;

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
public final class SavingsAccountTransactionTemplate_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.templates.savings.SavingsAccountTransactionTemplate_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> accountId = new Property<Integer>(SavingsAccountTransactionTemplate.class, "accountId");

  public static final Property<String> accountNo = new Property<String>(SavingsAccountTransactionTemplate.class, "accountNo");

  public static final Property<Boolean> reversed = new Property<Boolean>(SavingsAccountTransactionTemplate.class, "reversed");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{accountId,accountNo,reversed};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`accountId`":  {
        return accountId;
      }
      case "`accountNo`":  {
        return accountNo;
      }
      case "`reversed`":  {
        return reversed;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
