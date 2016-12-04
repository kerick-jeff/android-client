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
public final class SavingsAccountWithAssociations_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.savings.SavingsAccountWithAssociations_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(SavingsAccountWithAssociations.class, "id");

  public static final Property<String> accountNo = new Property<String>(SavingsAccountWithAssociations.class, "accountNo");

  public static final Property<String> clientName = new Property<String>(SavingsAccountWithAssociations.class, "clientName");

  public static final Property<String> savingsProductName = new Property<String>(SavingsAccountWithAssociations.class, "savingsProductName");

  public static final Property<Integer> status_id = new Property<Integer>(SavingsAccountWithAssociations.class, "status_id");

  public static final Property<Integer> summary_savingsId = new Property<Integer>(SavingsAccountWithAssociations.class, "summary_savingsId");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,accountNo,clientName,savingsProductName,status_id,summary_savingsId};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`accountNo`":  {
        return accountNo;
      }
      case "`clientName`":  {
        return clientName;
      }
      case "`savingsProductName`":  {
        return savingsProductName;
      }
      case "`status_id`":  {
        return status_id;
      }
      case "`summary_savingsId`":  {
        return summary_savingsId;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
