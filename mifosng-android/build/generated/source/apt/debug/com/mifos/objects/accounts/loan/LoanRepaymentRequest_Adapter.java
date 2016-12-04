package com.mifos.objects.accounts.loan;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.Method;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

public final class LoanRepaymentRequest_Adapter extends ModelAdapter<LoanRepaymentRequest> {
  public LoanRepaymentRequest_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<LoanRepaymentRequest> getModelClass() {
    return LoanRepaymentRequest.class;
  }

  public final String getTableName() {
    return "`LoanRepaymentRequest`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return LoanRepaymentRequest_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, LoanRepaymentRequest model) {
    values.put(LoanRepaymentRequest_Table.timeStamp.getCursorKey(), model.timeStamp);
    if (model.loanId != null) {
      values.put(LoanRepaymentRequest_Table.loanId.getCursorKey(), model.loanId);
    } else {
      values.putNull(LoanRepaymentRequest_Table.loanId.getCursorKey());
    }
    if (model.errorMessage != null) {
      values.put(LoanRepaymentRequest_Table.errorMessage.getCursorKey(), model.errorMessage);
    } else {
      values.putNull(LoanRepaymentRequest_Table.errorMessage.getCursorKey());
    }
    if (model.dateFormat != null) {
      values.put(LoanRepaymentRequest_Table.dateFormat.getCursorKey(), model.dateFormat);
    } else {
      values.putNull(LoanRepaymentRequest_Table.dateFormat.getCursorKey());
    }
    if (model.locale != null) {
      values.put(LoanRepaymentRequest_Table.locale.getCursorKey(), model.locale);
    } else {
      values.putNull(LoanRepaymentRequest_Table.locale.getCursorKey());
    }
    if (model.transactionDate != null) {
      values.put(LoanRepaymentRequest_Table.transactionDate.getCursorKey(), model.transactionDate);
    } else {
      values.putNull(LoanRepaymentRequest_Table.transactionDate.getCursorKey());
    }
    if (model.transactionAmount != null) {
      values.put(LoanRepaymentRequest_Table.transactionAmount.getCursorKey(), model.transactionAmount);
    } else {
      values.putNull(LoanRepaymentRequest_Table.transactionAmount.getCursorKey());
    }
    if (model.paymentTypeId != null) {
      values.put(LoanRepaymentRequest_Table.paymentTypeId.getCursorKey(), model.paymentTypeId);
    } else {
      values.putNull(LoanRepaymentRequest_Table.paymentTypeId.getCursorKey());
    }
    if (model.note != null) {
      values.put(LoanRepaymentRequest_Table.note.getCursorKey(), model.note);
    } else {
      values.putNull(LoanRepaymentRequest_Table.note.getCursorKey());
    }
    if (model.accountNumber != null) {
      values.put(LoanRepaymentRequest_Table.accountNumber.getCursorKey(), model.accountNumber);
    } else {
      values.putNull(LoanRepaymentRequest_Table.accountNumber.getCursorKey());
    }
    if (model.checkNumber != null) {
      values.put(LoanRepaymentRequest_Table.checkNumber.getCursorKey(), model.checkNumber);
    } else {
      values.putNull(LoanRepaymentRequest_Table.checkNumber.getCursorKey());
    }
    if (model.routingCode != null) {
      values.put(LoanRepaymentRequest_Table.routingCode.getCursorKey(), model.routingCode);
    } else {
      values.putNull(LoanRepaymentRequest_Table.routingCode.getCursorKey());
    }
    if (model.receiptNumber != null) {
      values.put(LoanRepaymentRequest_Table.receiptNumber.getCursorKey(), model.receiptNumber);
    } else {
      values.putNull(LoanRepaymentRequest_Table.receiptNumber.getCursorKey());
    }
    if (model.bankNumber != null) {
      values.put(LoanRepaymentRequest_Table.bankNumber.getCursorKey(), model.bankNumber);
    } else {
      values.putNull(LoanRepaymentRequest_Table.bankNumber.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, LoanRepaymentRequest model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, LoanRepaymentRequest model, int start) {
    statement.bindLong(1 + start, model.timeStamp);
    if (model.loanId != null) {
      statement.bindLong(2 + start, model.loanId);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.errorMessage != null) {
      statement.bindString(3 + start, model.errorMessage);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.dateFormat != null) {
      statement.bindString(4 + start, model.dateFormat);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.locale != null) {
      statement.bindString(5 + start, model.locale);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.transactionDate != null) {
      statement.bindString(6 + start, model.transactionDate);
    } else {
      statement.bindNull(6 + start);
    }
    if (model.transactionAmount != null) {
      statement.bindString(7 + start, model.transactionAmount);
    } else {
      statement.bindNull(7 + start);
    }
    if (model.paymentTypeId != null) {
      statement.bindString(8 + start, model.paymentTypeId);
    } else {
      statement.bindNull(8 + start);
    }
    if (model.note != null) {
      statement.bindString(9 + start, model.note);
    } else {
      statement.bindNull(9 + start);
    }
    if (model.accountNumber != null) {
      statement.bindString(10 + start, model.accountNumber);
    } else {
      statement.bindNull(10 + start);
    }
    if (model.checkNumber != null) {
      statement.bindString(11 + start, model.checkNumber);
    } else {
      statement.bindNull(11 + start);
    }
    if (model.routingCode != null) {
      statement.bindString(12 + start, model.routingCode);
    } else {
      statement.bindNull(12 + start);
    }
    if (model.receiptNumber != null) {
      statement.bindString(13 + start, model.receiptNumber);
    } else {
      statement.bindNull(13 + start);
    }
    if (model.bankNumber != null) {
      statement.bindString(14 + start, model.bankNumber);
    } else {
      statement.bindNull(14 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, LoanRepaymentRequest model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `LoanRepaymentRequest`(`timeStamp`,`loanId`,`errorMessage`,`dateFormat`,`locale`,`transactionDate`,`transactionAmount`,`paymentTypeId`,`note`,`accountNumber`,`checkNumber`,`routingCode`,`receiptNumber`,`bankNumber`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `LoanRepaymentRequest`(`timeStamp`,`loanId`,`errorMessage`,`dateFormat`,`locale`,`transactionDate`,`transactionAmount`,`paymentTypeId`,`note`,`accountNumber`,`checkNumber`,`routingCode`,`receiptNumber`,`bankNumber`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `LoanRepaymentRequest`(`timeStamp` INTEGER,`loanId` INTEGER,`errorMessage` TEXT,`dateFormat` TEXT,`locale` TEXT,`transactionDate` TEXT,`transactionAmount` TEXT,`paymentTypeId` TEXT,`note` TEXT,`accountNumber` TEXT,`checkNumber` TEXT,`routingCode` TEXT,`receiptNumber` TEXT,`bankNumber` TEXT, PRIMARY KEY(`timeStamp`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, LoanRepaymentRequest model) {
    int indextimeStamp = cursor.getColumnIndex("timeStamp");
    if (indextimeStamp != -1 && !cursor.isNull(indextimeStamp)) {
      model.timeStamp = cursor.getLong(indextimeStamp);
    } else {
      model.timeStamp = 0;
    }
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      model.loanId = cursor.getInt(indexloanId);
    } else {
      model.loanId = null;
    }
    int indexerrorMessage = cursor.getColumnIndex("errorMessage");
    if (indexerrorMessage != -1 && !cursor.isNull(indexerrorMessage)) {
      model.errorMessage = cursor.getString(indexerrorMessage);
    } else {
      model.errorMessage = null;
    }
    int indexdateFormat = cursor.getColumnIndex("dateFormat");
    if (indexdateFormat != -1 && !cursor.isNull(indexdateFormat)) {
      model.dateFormat = cursor.getString(indexdateFormat);
    } else {
      model.dateFormat = null;
    }
    int indexlocale = cursor.getColumnIndex("locale");
    if (indexlocale != -1 && !cursor.isNull(indexlocale)) {
      model.locale = cursor.getString(indexlocale);
    } else {
      model.locale = null;
    }
    int indextransactionDate = cursor.getColumnIndex("transactionDate");
    if (indextransactionDate != -1 && !cursor.isNull(indextransactionDate)) {
      model.transactionDate = cursor.getString(indextransactionDate);
    } else {
      model.transactionDate = null;
    }
    int indextransactionAmount = cursor.getColumnIndex("transactionAmount");
    if (indextransactionAmount != -1 && !cursor.isNull(indextransactionAmount)) {
      model.transactionAmount = cursor.getString(indextransactionAmount);
    } else {
      model.transactionAmount = null;
    }
    int indexpaymentTypeId = cursor.getColumnIndex("paymentTypeId");
    if (indexpaymentTypeId != -1 && !cursor.isNull(indexpaymentTypeId)) {
      model.paymentTypeId = cursor.getString(indexpaymentTypeId);
    } else {
      model.paymentTypeId = null;
    }
    int indexnote = cursor.getColumnIndex("note");
    if (indexnote != -1 && !cursor.isNull(indexnote)) {
      model.note = cursor.getString(indexnote);
    } else {
      model.note = null;
    }
    int indexaccountNumber = cursor.getColumnIndex("accountNumber");
    if (indexaccountNumber != -1 && !cursor.isNull(indexaccountNumber)) {
      model.accountNumber = cursor.getString(indexaccountNumber);
    } else {
      model.accountNumber = null;
    }
    int indexcheckNumber = cursor.getColumnIndex("checkNumber");
    if (indexcheckNumber != -1 && !cursor.isNull(indexcheckNumber)) {
      model.checkNumber = cursor.getString(indexcheckNumber);
    } else {
      model.checkNumber = null;
    }
    int indexroutingCode = cursor.getColumnIndex("routingCode");
    if (indexroutingCode != -1 && !cursor.isNull(indexroutingCode)) {
      model.routingCode = cursor.getString(indexroutingCode);
    } else {
      model.routingCode = null;
    }
    int indexreceiptNumber = cursor.getColumnIndex("receiptNumber");
    if (indexreceiptNumber != -1 && !cursor.isNull(indexreceiptNumber)) {
      model.receiptNumber = cursor.getString(indexreceiptNumber);
    } else {
      model.receiptNumber = null;
    }
    int indexbankNumber = cursor.getColumnIndex("bankNumber");
    if (indexbankNumber != -1 && !cursor.isNull(indexbankNumber)) {
      model.bankNumber = cursor.getString(indexbankNumber);
    } else {
      model.bankNumber = null;
    }
  }

  @Override
  public final boolean exists(LoanRepaymentRequest model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(LoanRepaymentRequest.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(LoanRepaymentRequest model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(LoanRepaymentRequest_Table.timeStamp.eq(model.timeStamp));return clause;
  }

  @Override
  public final LoanRepaymentRequest newInstance() {
    return new LoanRepaymentRequest();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return LoanRepaymentRequest_Table.getProperty(name);
  }
}
