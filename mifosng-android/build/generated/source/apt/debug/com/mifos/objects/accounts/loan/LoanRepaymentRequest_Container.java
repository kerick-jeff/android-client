package com.mifos.objects.accounts.loan;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.Method;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.structure.container.ForeignKeyContainer;
import com.raizlabs.android.dbflow.structure.container.ModelContainer;
import com.raizlabs.android.dbflow.structure.container.ModelContainerAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class LoanRepaymentRequest_Container extends ModelContainerAdapter<LoanRepaymentRequest> {
  public LoanRepaymentRequest_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("timeStamp", long.class);
    columnMap.put("loanId", Integer.class);
    columnMap.put("errorMessage", String.class);
    columnMap.put("dateFormat", String.class);
    columnMap.put("locale", String.class);
    columnMap.put("transactionDate", String.class);
    columnMap.put("transactionAmount", String.class);
    columnMap.put("paymentTypeId", String.class);
    columnMap.put("note", String.class);
    columnMap.put("accountNumber", String.class);
    columnMap.put("checkNumber", String.class);
    columnMap.put("routingCode", String.class);
    columnMap.put("receiptNumber", String.class);
    columnMap.put("bankNumber", String.class);
  }

  @Override
  public final Class<LoanRepaymentRequest> getModelClass() {
    return LoanRepaymentRequest.class;
  }

  public final String getTableName() {
    return "`LoanRepaymentRequest`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<LoanRepaymentRequest, ?> modelContainer) {
    values.put(LoanRepaymentRequest_Table.timeStamp.getCursorKey(), modelContainer.getLngValue("timeStamp"));
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      values.put(LoanRepaymentRequest_Table.loanId.getCursorKey(), modelContainerloanId);
    } else {
      values.putNull(LoanRepaymentRequest_Table.loanId.getCursorKey());
    }
    String modelContainererrorMessage = modelContainer.getStringValue("errorMessage");
    if (modelContainererrorMessage != null) {
      values.put(LoanRepaymentRequest_Table.errorMessage.getCursorKey(), modelContainererrorMessage);
    } else {
      values.putNull(LoanRepaymentRequest_Table.errorMessage.getCursorKey());
    }
    String modelContainerdateFormat = modelContainer.getStringValue("dateFormat");
    if (modelContainerdateFormat != null) {
      values.put(LoanRepaymentRequest_Table.dateFormat.getCursorKey(), modelContainerdateFormat);
    } else {
      values.putNull(LoanRepaymentRequest_Table.dateFormat.getCursorKey());
    }
    String modelContainerlocale = modelContainer.getStringValue("locale");
    if (modelContainerlocale != null) {
      values.put(LoanRepaymentRequest_Table.locale.getCursorKey(), modelContainerlocale);
    } else {
      values.putNull(LoanRepaymentRequest_Table.locale.getCursorKey());
    }
    String modelContainertransactionDate = modelContainer.getStringValue("transactionDate");
    if (modelContainertransactionDate != null) {
      values.put(LoanRepaymentRequest_Table.transactionDate.getCursorKey(), modelContainertransactionDate);
    } else {
      values.putNull(LoanRepaymentRequest_Table.transactionDate.getCursorKey());
    }
    String modelContainertransactionAmount = modelContainer.getStringValue("transactionAmount");
    if (modelContainertransactionAmount != null) {
      values.put(LoanRepaymentRequest_Table.transactionAmount.getCursorKey(), modelContainertransactionAmount);
    } else {
      values.putNull(LoanRepaymentRequest_Table.transactionAmount.getCursorKey());
    }
    String modelContainerpaymentTypeId = modelContainer.getStringValue("paymentTypeId");
    if (modelContainerpaymentTypeId != null) {
      values.put(LoanRepaymentRequest_Table.paymentTypeId.getCursorKey(), modelContainerpaymentTypeId);
    } else {
      values.putNull(LoanRepaymentRequest_Table.paymentTypeId.getCursorKey());
    }
    String modelContainernote = modelContainer.getStringValue("note");
    if (modelContainernote != null) {
      values.put(LoanRepaymentRequest_Table.note.getCursorKey(), modelContainernote);
    } else {
      values.putNull(LoanRepaymentRequest_Table.note.getCursorKey());
    }
    String modelContaineraccountNumber = modelContainer.getStringValue("accountNumber");
    if (modelContaineraccountNumber != null) {
      values.put(LoanRepaymentRequest_Table.accountNumber.getCursorKey(), modelContaineraccountNumber);
    } else {
      values.putNull(LoanRepaymentRequest_Table.accountNumber.getCursorKey());
    }
    String modelContainercheckNumber = modelContainer.getStringValue("checkNumber");
    if (modelContainercheckNumber != null) {
      values.put(LoanRepaymentRequest_Table.checkNumber.getCursorKey(), modelContainercheckNumber);
    } else {
      values.putNull(LoanRepaymentRequest_Table.checkNumber.getCursorKey());
    }
    String modelContainerroutingCode = modelContainer.getStringValue("routingCode");
    if (modelContainerroutingCode != null) {
      values.put(LoanRepaymentRequest_Table.routingCode.getCursorKey(), modelContainerroutingCode);
    } else {
      values.putNull(LoanRepaymentRequest_Table.routingCode.getCursorKey());
    }
    String modelContainerreceiptNumber = modelContainer.getStringValue("receiptNumber");
    if (modelContainerreceiptNumber != null) {
      values.put(LoanRepaymentRequest_Table.receiptNumber.getCursorKey(), modelContainerreceiptNumber);
    } else {
      values.putNull(LoanRepaymentRequest_Table.receiptNumber.getCursorKey());
    }
    String modelContainerbankNumber = modelContainer.getStringValue("bankNumber");
    if (modelContainerbankNumber != null) {
      values.put(LoanRepaymentRequest_Table.bankNumber.getCursorKey(), modelContainerbankNumber);
    } else {
      values.putNull(LoanRepaymentRequest_Table.bankNumber.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<LoanRepaymentRequest, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<LoanRepaymentRequest, ?> modelContainer, int start) {
    statement.bindLong(1 + start, modelContainer.getLngValue("timeStamp"));
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      statement.bindLong(2 + start, modelContainerloanId);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainererrorMessage = modelContainer.getStringValue("errorMessage");
    if (modelContainererrorMessage != null) {
      statement.bindString(3 + start, modelContainererrorMessage);
    } else {
      statement.bindNull(3 + start);
    }
    String modelContainerdateFormat = modelContainer.getStringValue("dateFormat");
    if (modelContainerdateFormat != null) {
      statement.bindString(4 + start, modelContainerdateFormat);
    } else {
      statement.bindNull(4 + start);
    }
    String modelContainerlocale = modelContainer.getStringValue("locale");
    if (modelContainerlocale != null) {
      statement.bindString(5 + start, modelContainerlocale);
    } else {
      statement.bindNull(5 + start);
    }
    String modelContainertransactionDate = modelContainer.getStringValue("transactionDate");
    if (modelContainertransactionDate != null) {
      statement.bindString(6 + start, modelContainertransactionDate);
    } else {
      statement.bindNull(6 + start);
    }
    String modelContainertransactionAmount = modelContainer.getStringValue("transactionAmount");
    if (modelContainertransactionAmount != null) {
      statement.bindString(7 + start, modelContainertransactionAmount);
    } else {
      statement.bindNull(7 + start);
    }
    String modelContainerpaymentTypeId = modelContainer.getStringValue("paymentTypeId");
    if (modelContainerpaymentTypeId != null) {
      statement.bindString(8 + start, modelContainerpaymentTypeId);
    } else {
      statement.bindNull(8 + start);
    }
    String modelContainernote = modelContainer.getStringValue("note");
    if (modelContainernote != null) {
      statement.bindString(9 + start, modelContainernote);
    } else {
      statement.bindNull(9 + start);
    }
    String modelContaineraccountNumber = modelContainer.getStringValue("accountNumber");
    if (modelContaineraccountNumber != null) {
      statement.bindString(10 + start, modelContaineraccountNumber);
    } else {
      statement.bindNull(10 + start);
    }
    String modelContainercheckNumber = modelContainer.getStringValue("checkNumber");
    if (modelContainercheckNumber != null) {
      statement.bindString(11 + start, modelContainercheckNumber);
    } else {
      statement.bindNull(11 + start);
    }
    String modelContainerroutingCode = modelContainer.getStringValue("routingCode");
    if (modelContainerroutingCode != null) {
      statement.bindString(12 + start, modelContainerroutingCode);
    } else {
      statement.bindNull(12 + start);
    }
    String modelContainerreceiptNumber = modelContainer.getStringValue("receiptNumber");
    if (modelContainerreceiptNumber != null) {
      statement.bindString(13 + start, modelContainerreceiptNumber);
    } else {
      statement.bindNull(13 + start);
    }
    String modelContainerbankNumber = modelContainer.getStringValue("bankNumber");
    if (modelContainerbankNumber != null) {
      statement.bindString(14 + start, modelContainerbankNumber);
    } else {
      statement.bindNull(14 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<LoanRepaymentRequest, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<LoanRepaymentRequest, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(LoanRepaymentRequest.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<LoanRepaymentRequest, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(LoanRepaymentRequest_Table.timeStamp.eq(modelContainer.getLngValue("timeStamp")));return clause;
  }

  @Override
  public final LoanRepaymentRequest toModel(ModelContainer<LoanRepaymentRequest, ?> modelContainer) {
    LoanRepaymentRequest model = new LoanRepaymentRequest();
    model.timeStamp = modelContainer.getLngValue("timeStamp");
    model.loanId = modelContainer.getIntegerValue("loanId");
    model.errorMessage = modelContainer.getStringValue("errorMessage");
    model.dateFormat = modelContainer.getStringValue("dateFormat");
    model.locale = modelContainer.getStringValue("locale");
    model.transactionDate = modelContainer.getStringValue("transactionDate");
    model.transactionAmount = modelContainer.getStringValue("transactionAmount");
    model.paymentTypeId = modelContainer.getStringValue("paymentTypeId");
    model.note = modelContainer.getStringValue("note");
    model.accountNumber = modelContainer.getStringValue("accountNumber");
    model.checkNumber = modelContainer.getStringValue("checkNumber");
    model.routingCode = modelContainer.getStringValue("routingCode");
    model.receiptNumber = modelContainer.getStringValue("receiptNumber");
    model.bankNumber = modelContainer.getStringValue("bankNumber");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<LoanRepaymentRequest, ?> modelContainer) {
    int indextimeStamp = cursor.getColumnIndex("timeStamp");
    if (indextimeStamp != -1 && !cursor.isNull(indextimeStamp)) {
      modelContainer.put("timeStamp", cursor.getLong(indextimeStamp));
    } else {
      modelContainer.putDefault("timeStamp");
    }
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      modelContainer.put("loanId", cursor.getInt(indexloanId));
    } else {
      modelContainer.putDefault("loanId");
    }
    int indexerrorMessage = cursor.getColumnIndex("errorMessage");
    if (indexerrorMessage != -1 && !cursor.isNull(indexerrorMessage)) {
      modelContainer.put("errorMessage", cursor.getString(indexerrorMessage));
    } else {
      modelContainer.putDefault("errorMessage");
    }
    int indexdateFormat = cursor.getColumnIndex("dateFormat");
    if (indexdateFormat != -1 && !cursor.isNull(indexdateFormat)) {
      modelContainer.put("dateFormat", cursor.getString(indexdateFormat));
    } else {
      modelContainer.putDefault("dateFormat");
    }
    int indexlocale = cursor.getColumnIndex("locale");
    if (indexlocale != -1 && !cursor.isNull(indexlocale)) {
      modelContainer.put("locale", cursor.getString(indexlocale));
    } else {
      modelContainer.putDefault("locale");
    }
    int indextransactionDate = cursor.getColumnIndex("transactionDate");
    if (indextransactionDate != -1 && !cursor.isNull(indextransactionDate)) {
      modelContainer.put("transactionDate", cursor.getString(indextransactionDate));
    } else {
      modelContainer.putDefault("transactionDate");
    }
    int indextransactionAmount = cursor.getColumnIndex("transactionAmount");
    if (indextransactionAmount != -1 && !cursor.isNull(indextransactionAmount)) {
      modelContainer.put("transactionAmount", cursor.getString(indextransactionAmount));
    } else {
      modelContainer.putDefault("transactionAmount");
    }
    int indexpaymentTypeId = cursor.getColumnIndex("paymentTypeId");
    if (indexpaymentTypeId != -1 && !cursor.isNull(indexpaymentTypeId)) {
      modelContainer.put("paymentTypeId", cursor.getString(indexpaymentTypeId));
    } else {
      modelContainer.putDefault("paymentTypeId");
    }
    int indexnote = cursor.getColumnIndex("note");
    if (indexnote != -1 && !cursor.isNull(indexnote)) {
      modelContainer.put("note", cursor.getString(indexnote));
    } else {
      modelContainer.putDefault("note");
    }
    int indexaccountNumber = cursor.getColumnIndex("accountNumber");
    if (indexaccountNumber != -1 && !cursor.isNull(indexaccountNumber)) {
      modelContainer.put("accountNumber", cursor.getString(indexaccountNumber));
    } else {
      modelContainer.putDefault("accountNumber");
    }
    int indexcheckNumber = cursor.getColumnIndex("checkNumber");
    if (indexcheckNumber != -1 && !cursor.isNull(indexcheckNumber)) {
      modelContainer.put("checkNumber", cursor.getString(indexcheckNumber));
    } else {
      modelContainer.putDefault("checkNumber");
    }
    int indexroutingCode = cursor.getColumnIndex("routingCode");
    if (indexroutingCode != -1 && !cursor.isNull(indexroutingCode)) {
      modelContainer.put("routingCode", cursor.getString(indexroutingCode));
    } else {
      modelContainer.putDefault("routingCode");
    }
    int indexreceiptNumber = cursor.getColumnIndex("receiptNumber");
    if (indexreceiptNumber != -1 && !cursor.isNull(indexreceiptNumber)) {
      modelContainer.put("receiptNumber", cursor.getString(indexreceiptNumber));
    } else {
      modelContainer.putDefault("receiptNumber");
    }
    int indexbankNumber = cursor.getColumnIndex("bankNumber");
    if (indexbankNumber != -1 && !cursor.isNull(indexbankNumber)) {
      modelContainer.put("bankNumber", cursor.getString(indexbankNumber));
    } else {
      modelContainer.putDefault("bankNumber");
    }
  }

  @Override
  public final ForeignKeyContainer<LoanRepaymentRequest> toForeignKeyContainer(LoanRepaymentRequest model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(LoanRepaymentRequest.class);
    modelContainer.put(LoanRepaymentRequest_Table.timeStamp, model.timeStamp);
    return modelContainer;
  }
}
