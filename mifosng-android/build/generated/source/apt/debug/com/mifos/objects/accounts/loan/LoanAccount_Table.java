package com.mifos.objects.accounts.loan;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.LongProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class LoanAccount_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.loan.LoanAccount_Table.getProperty(columnName); 
  }
  };

  public static final LongProperty clientId = new LongProperty(LoanAccount.class, "clientId");

  public static final LongProperty groupId = new LongProperty(LoanAccount.class, "groupId");

  public static final Property<Integer> id = new Property<Integer>(LoanAccount.class, "id");

  public static final Property<String> accountNo = new Property<String>(LoanAccount.class, "accountNo");

  public static final Property<String> externalId = new Property<String>(LoanAccount.class, "externalId");

  public static final Property<Integer> productId = new Property<Integer>(LoanAccount.class, "productId");

  public static final Property<String> productName = new Property<String>(LoanAccount.class, "productName");

  public static final Property<Integer> status_id = new Property<Integer>(LoanAccount.class, "status_id");

  public static final Property<Integer> loanType_id = new Property<Integer>(LoanAccount.class, "loanType_id");

  public static final Property<Integer> loanCycle = new Property<Integer>(LoanAccount.class, "loanCycle");

  public static final Property<Boolean> inArrears = new Property<Boolean>(LoanAccount.class, "inArrears");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{clientId,groupId,id,accountNo,externalId,productId,productName,status_id,loanType_id,loanCycle,inArrears};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`clientId`":  {
        return clientId;
      }
      case "`groupId`":  {
        return groupId;
      }
      case "`id`":  {
        return id;
      }
      case "`accountNo`":  {
        return accountNo;
      }
      case "`externalId`":  {
        return externalId;
      }
      case "`productId`":  {
        return productId;
      }
      case "`productName`":  {
        return productName;
      }
      case "`status_id`":  {
        return status_id;
      }
      case "`loanType_id`":  {
        return loanType_id;
      }
      case "`loanCycle`":  {
        return loanCycle;
      }
      case "`inArrears`":  {
        return inArrears;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
