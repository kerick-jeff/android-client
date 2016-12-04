package com.mifos.objects.accounts.savings;

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
public final class SavingsAccountTransactionRequest_Container extends ModelContainerAdapter<SavingsAccountTransactionRequest> {
  public SavingsAccountTransactionRequest_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("savingAccountId", Integer.class);
    columnMap.put("savingsAccountType", String.class);
    columnMap.put("transactionType", String.class);
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
    columnMap.put("errorMessage", String.class);
  }

  @Override
  public final Class<SavingsAccountTransactionRequest> getModelClass() {
    return SavingsAccountTransactionRequest.class;
  }

  public final String getTableName() {
    return "`SavingsAccountTransactionRequest`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<SavingsAccountTransactionRequest, ?> modelContainer) {
    Integer modelContainersavingAccountId = modelContainer.getIntegerValue("savingAccountId");
    if (modelContainersavingAccountId != null) {
      values.put(SavingsAccountTransactionRequest_Table.savingAccountId.getCursorKey(), modelContainersavingAccountId);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.savingAccountId.getCursorKey());
    }
    String modelContainersavingsAccountType = modelContainer.getStringValue("savingsAccountType");
    if (modelContainersavingsAccountType != null) {
      values.put(SavingsAccountTransactionRequest_Table.savingsAccountType.getCursorKey(), modelContainersavingsAccountType);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.savingsAccountType.getCursorKey());
    }
    String modelContainertransactionType = modelContainer.getStringValue("transactionType");
    if (modelContainertransactionType != null) {
      values.put(SavingsAccountTransactionRequest_Table.transactionType.getCursorKey(), modelContainertransactionType);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.transactionType.getCursorKey());
    }
    String modelContainerdateFormat = modelContainer.getStringValue("dateFormat");
    if (modelContainerdateFormat != null) {
      values.put(SavingsAccountTransactionRequest_Table.dateFormat.getCursorKey(), modelContainerdateFormat);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.dateFormat.getCursorKey());
    }
    String modelContainerlocale = modelContainer.getStringValue("locale");
    if (modelContainerlocale != null) {
      values.put(SavingsAccountTransactionRequest_Table.locale.getCursorKey(), modelContainerlocale);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.locale.getCursorKey());
    }
    String modelContainertransactionDate = modelContainer.getStringValue("transactionDate");
    if (modelContainertransactionDate != null) {
      values.put(SavingsAccountTransactionRequest_Table.transactionDate.getCursorKey(), modelContainertransactionDate);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.transactionDate.getCursorKey());
    }
    String modelContainertransactionAmount = modelContainer.getStringValue("transactionAmount");
    if (modelContainertransactionAmount != null) {
      values.put(SavingsAccountTransactionRequest_Table.transactionAmount.getCursorKey(), modelContainertransactionAmount);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.transactionAmount.getCursorKey());
    }
    String modelContainerpaymentTypeId = modelContainer.getStringValue("paymentTypeId");
    if (modelContainerpaymentTypeId != null) {
      values.put(SavingsAccountTransactionRequest_Table.paymentTypeId.getCursorKey(), modelContainerpaymentTypeId);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.paymentTypeId.getCursorKey());
    }
    String modelContainernote = modelContainer.getStringValue("note");
    if (modelContainernote != null) {
      values.put(SavingsAccountTransactionRequest_Table.note.getCursorKey(), modelContainernote);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.note.getCursorKey());
    }
    String modelContaineraccountNumber = modelContainer.getStringValue("accountNumber");
    if (modelContaineraccountNumber != null) {
      values.put(SavingsAccountTransactionRequest_Table.accountNumber.getCursorKey(), modelContaineraccountNumber);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.accountNumber.getCursorKey());
    }
    String modelContainercheckNumber = modelContainer.getStringValue("checkNumber");
    if (modelContainercheckNumber != null) {
      values.put(SavingsAccountTransactionRequest_Table.checkNumber.getCursorKey(), modelContainercheckNumber);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.checkNumber.getCursorKey());
    }
    String modelContainerroutingCode = modelContainer.getStringValue("routingCode");
    if (modelContainerroutingCode != null) {
      values.put(SavingsAccountTransactionRequest_Table.routingCode.getCursorKey(), modelContainerroutingCode);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.routingCode.getCursorKey());
    }
    String modelContainerreceiptNumber = modelContainer.getStringValue("receiptNumber");
    if (modelContainerreceiptNumber != null) {
      values.put(SavingsAccountTransactionRequest_Table.receiptNumber.getCursorKey(), modelContainerreceiptNumber);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.receiptNumber.getCursorKey());
    }
    String modelContainerbankNumber = modelContainer.getStringValue("bankNumber");
    if (modelContainerbankNumber != null) {
      values.put(SavingsAccountTransactionRequest_Table.bankNumber.getCursorKey(), modelContainerbankNumber);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.bankNumber.getCursorKey());
    }
    String modelContainererrorMessage = modelContainer.getStringValue("errorMessage");
    if (modelContainererrorMessage != null) {
      values.put(SavingsAccountTransactionRequest_Table.errorMessage.getCursorKey(), modelContainererrorMessage);
    } else {
      values.putNull(SavingsAccountTransactionRequest_Table.errorMessage.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<SavingsAccountTransactionRequest, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<SavingsAccountTransactionRequest, ?> modelContainer, int start) {
    Integer modelContainersavingAccountId = modelContainer.getIntegerValue("savingAccountId");
    if (modelContainersavingAccountId != null) {
      statement.bindLong(1 + start, modelContainersavingAccountId);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContainersavingsAccountType = modelContainer.getStringValue("savingsAccountType");
    if (modelContainersavingsAccountType != null) {
      statement.bindString(2 + start, modelContainersavingsAccountType);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainertransactionType = modelContainer.getStringValue("transactionType");
    if (modelContainertransactionType != null) {
      statement.bindString(3 + start, modelContainertransactionType);
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
    String modelContainererrorMessage = modelContainer.getStringValue("errorMessage");
    if (modelContainererrorMessage != null) {
      statement.bindString(15 + start, modelContainererrorMessage);
    } else {
      statement.bindNull(15 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<SavingsAccountTransactionRequest, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<SavingsAccountTransactionRequest, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingsAccountTransactionRequest.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<SavingsAccountTransactionRequest, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingsAccountTransactionRequest_Table.savingAccountId.eq(modelContainer.getIntegerValue("savingAccountId")));return clause;
  }

  @Override
  public final SavingsAccountTransactionRequest toModel(ModelContainer<SavingsAccountTransactionRequest, ?> modelContainer) {
    SavingsAccountTransactionRequest model = new SavingsAccountTransactionRequest();
    model.savingAccountId = modelContainer.getIntegerValue("savingAccountId");
    model.savingsAccountType = modelContainer.getStringValue("savingsAccountType");
    model.transactionType = modelContainer.getStringValue("transactionType");
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
    model.errorMessage = modelContainer.getStringValue("errorMessage");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<SavingsAccountTransactionRequest, ?> modelContainer) {
    int indexsavingAccountId = cursor.getColumnIndex("savingAccountId");
    if (indexsavingAccountId != -1 && !cursor.isNull(indexsavingAccountId)) {
      modelContainer.put("savingAccountId", cursor.getInt(indexsavingAccountId));
    } else {
      modelContainer.putDefault("savingAccountId");
    }
    int indexsavingsAccountType = cursor.getColumnIndex("savingsAccountType");
    if (indexsavingsAccountType != -1 && !cursor.isNull(indexsavingsAccountType)) {
      modelContainer.put("savingsAccountType", cursor.getString(indexsavingsAccountType));
    } else {
      modelContainer.putDefault("savingsAccountType");
    }
    int indextransactionType = cursor.getColumnIndex("transactionType");
    if (indextransactionType != -1 && !cursor.isNull(indextransactionType)) {
      modelContainer.put("transactionType", cursor.getString(indextransactionType));
    } else {
      modelContainer.putDefault("transactionType");
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
    int indexerrorMessage = cursor.getColumnIndex("errorMessage");
    if (indexerrorMessage != -1 && !cursor.isNull(indexerrorMessage)) {
      modelContainer.put("errorMessage", cursor.getString(indexerrorMessage));
    } else {
      modelContainer.putDefault("errorMessage");
    }
  }

  @Override
  public final ForeignKeyContainer<SavingsAccountTransactionRequest> toForeignKeyContainer(SavingsAccountTransactionRequest model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(SavingsAccountTransactionRequest.class);
    modelContainer.put(SavingsAccountTransactionRequest_Table.savingAccountId, model.savingAccountId);
    return modelContainer;
  }
}
