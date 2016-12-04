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
public final class LoanWithAssociations_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.loan.LoanWithAssociations_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(LoanWithAssociations.class, "id");

  public static final Property<String> accountNo = new Property<String>(LoanWithAssociations.class, "accountNo");

  public static final Property<Integer> status_id = new Property<Integer>(LoanWithAssociations.class, "status_id");

  public static final Property<String> clientName = new Property<String>(LoanWithAssociations.class, "clientName");

  public static final Property<String> loanProductName = new Property<String>(LoanWithAssociations.class, "loanProductName");

  public static final Property<String> loanOfficerName = new Property<String>(LoanWithAssociations.class, "loanOfficerName");

  public static final Property<Integer> timeline_loanId = new Property<Integer>(LoanWithAssociations.class, "timeline_loanId");

  public static final Property<Integer> summary_loanId = new Property<Integer>(LoanWithAssociations.class, "summary_loanId");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,accountNo,status_id,clientName,loanProductName,loanOfficerName,timeline_loanId,summary_loanId};
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
      case "`status_id`":  {
        return status_id;
      }
      case "`clientName`":  {
        return clientName;
      }
      case "`loanProductName`":  {
        return loanProductName;
      }
      case "`loanOfficerName`":  {
        return loanOfficerName;
      }
      case "`timeline_loanId`":  {
        return timeline_loanId;
      }
      case "`summary_loanId`":  {
        return summary_loanId;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
