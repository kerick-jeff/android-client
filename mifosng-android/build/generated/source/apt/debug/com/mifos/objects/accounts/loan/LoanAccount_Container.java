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
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class LoanAccount_Container extends ModelContainerAdapter<LoanAccount> {
  public LoanAccount_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("clientId", long.class);
    columnMap.put("groupId", long.class);
    columnMap.put("id", Integer.class);
    columnMap.put("accountNo", String.class);
    columnMap.put("externalId", String.class);
    columnMap.put("productId", Integer.class);
    columnMap.put("productName", String.class);
    columnMap.put("status", Status.class);
    columnMap.put("loanType", LoanType.class);
    columnMap.put("loanCycle", Integer.class);
    columnMap.put("inArrears", Boolean.class);
  }

  @Override
  public final Class<LoanAccount> getModelClass() {
    return LoanAccount.class;
  }

  public final String getTableName() {
    return "`LoanAccount`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<LoanAccount, ?> modelContainer) {
    values.put(LoanAccount_Table.clientId.getCursorKey(), modelContainer.getLngValue("clientId"));
    values.put(LoanAccount_Table.groupId.getCursorKey(), modelContainer.getLngValue("groupId"));
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(LoanAccount_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(LoanAccount_Table.id.getCursorKey());
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      values.put(LoanAccount_Table.accountNo.getCursorKey(), modelContaineraccountNo);
    } else {
      values.putNull(LoanAccount_Table.accountNo.getCursorKey());
    }
    String modelContainerexternalId = modelContainer.getStringValue("externalId");
    if (modelContainerexternalId != null) {
      values.put(LoanAccount_Table.externalId.getCursorKey(), modelContainerexternalId);
    } else {
      values.putNull(LoanAccount_Table.externalId.getCursorKey());
    }
    Integer modelContainerproductId = modelContainer.getIntegerValue("productId");
    if (modelContainerproductId != null) {
      values.put(LoanAccount_Table.productId.getCursorKey(), modelContainerproductId);
    } else {
      values.putNull(LoanAccount_Table.productId.getCursorKey());
    }
    String modelContainerproductName = modelContainer.getStringValue("productName");
    if (modelContainerproductName != null) {
      values.put(LoanAccount_Table.productName.getCursorKey(), modelContainerproductName);
    } else {
      values.putNull(LoanAccount_Table.productName.getCursorKey());
    }
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.loan.Status.class);
    if (refstatus != null) {
      refstatus.save();
      Integer refstatusid = refstatus.getIntegerValue("id");
      if (refstatusid != null) {
        values.put(LoanAccount_Table.status_id.getCursorKey(), refstatusid);
      } else {
        values.putNull(LoanAccount_Table.status_id.getCursorKey());
      }
    } else {
      values.putNull("`status_id`");
    }
    ModelContainer<LoanType, ?> refloanType = modelContainer.getInstance(modelContainer.getValue("loanType"), com.mifos.objects.accounts.loan.LoanType.class);
    if (refloanType != null) {
      refloanType.save();
      Integer refloanTypeid = refloanType.getIntegerValue("id");
      if (refloanTypeid != null) {
        values.put(LoanAccount_Table.loanType_id.getCursorKey(), refloanTypeid);
      } else {
        values.putNull(LoanAccount_Table.loanType_id.getCursorKey());
      }
    } else {
      values.putNull("`loanType_id`");
    }
    Integer modelContainerloanCycle = modelContainer.getIntegerValue("loanCycle");
    if (modelContainerloanCycle != null) {
      values.put(LoanAccount_Table.loanCycle.getCursorKey(), modelContainerloanCycle);
    } else {
      values.putNull(LoanAccount_Table.loanCycle.getCursorKey());
    }
    Integer modelContainerinArrears = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("inArrears"));
    if (modelContainerinArrears != null) {
      values.put(LoanAccount_Table.inArrears.getCursorKey(), modelContainerinArrears);
    } else {
      values.putNull(LoanAccount_Table.inArrears.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<LoanAccount, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<LoanAccount, ?> modelContainer, int start) {
    statement.bindLong(1 + start, modelContainer.getLngValue("clientId"));
    statement.bindLong(2 + start, modelContainer.getLngValue("groupId"));
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(3 + start, modelContainerid);
    } else {
      statement.bindNull(3 + start);
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      statement.bindString(4 + start, modelContaineraccountNo);
    } else {
      statement.bindNull(4 + start);
    }
    String modelContainerexternalId = modelContainer.getStringValue("externalId");
    if (modelContainerexternalId != null) {
      statement.bindString(5 + start, modelContainerexternalId);
    } else {
      statement.bindNull(5 + start);
    }
    Integer modelContainerproductId = modelContainer.getIntegerValue("productId");
    if (modelContainerproductId != null) {
      statement.bindLong(6 + start, modelContainerproductId);
    } else {
      statement.bindNull(6 + start);
    }
    String modelContainerproductName = modelContainer.getStringValue("productName");
    if (modelContainerproductName != null) {
      statement.bindString(7 + start, modelContainerproductName);
    } else {
      statement.bindNull(7 + start);
    }
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.loan.Status.class);
    if (refstatus != null) {
      refstatus.save();
      Integer refstatusid = refstatus.getIntegerValue("id");
      if (refstatusid != null) {
        statement.bindLong(8 + start, refstatusid);
      } else {
        statement.bindNull(8 + start);
      }
    } else {
      statement.bindNull(8 + start);
    }
    ModelContainer<LoanType, ?> refloanType = modelContainer.getInstance(modelContainer.getValue("loanType"), com.mifos.objects.accounts.loan.LoanType.class);
    if (refloanType != null) {
      refloanType.save();
      Integer refloanTypeid = refloanType.getIntegerValue("id");
      if (refloanTypeid != null) {
        statement.bindLong(9 + start, refloanTypeid);
      } else {
        statement.bindNull(9 + start);
      }
    } else {
      statement.bindNull(9 + start);
    }
    Integer modelContainerloanCycle = modelContainer.getIntegerValue("loanCycle");
    if (modelContainerloanCycle != null) {
      statement.bindLong(10 + start, modelContainerloanCycle);
    } else {
      statement.bindNull(10 + start);
    }
    Integer modelContainerinArrears = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("inArrears"));
    if (modelContainerinArrears != null) {
      statement.bindLong(11 + start, modelContainerinArrears);
    } else {
      statement.bindNull(11 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<LoanAccount, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<LoanAccount, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(LoanAccount.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<LoanAccount, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(LoanAccount_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final LoanAccount toModel(ModelContainer<LoanAccount, ?> modelContainer) {
    LoanAccount model = new LoanAccount();
    model.clientId = modelContainer.getLngValue("clientId");
    model.groupId = modelContainer.getLngValue("groupId");
    model.id = modelContainer.getIntegerValue("id");
    model.accountNo = modelContainer.getStringValue("accountNo");
    model.externalId = modelContainer.getStringValue("externalId");
    model.productId = modelContainer.getIntegerValue("productId");
    model.productName = modelContainer.getStringValue("productName");
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.loan.Status.class);
    if (refstatus != null) {
      model.status = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.loan.Status.class).toModel(refstatus);
    }
    ModelContainer<LoanType, ?> refloanType = modelContainer.getInstance(modelContainer.getValue("loanType"), com.mifos.objects.accounts.loan.LoanType.class);
    if (refloanType != null) {
      model.loanType = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.loan.LoanType.class).toModel(refloanType);
    }
    model.loanCycle = modelContainer.getIntegerValue("loanCycle");
    model.inArrears = modelContainer.getBooleanValue("inArrears");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<LoanAccount, ?> modelContainer) {
    int indexclientId = cursor.getColumnIndex("clientId");
    if (indexclientId != -1 && !cursor.isNull(indexclientId)) {
      modelContainer.put("clientId", cursor.getLong(indexclientId));
    } else {
      modelContainer.putDefault("clientId");
    }
    int indexgroupId = cursor.getColumnIndex("groupId");
    if (indexgroupId != -1 && !cursor.isNull(indexgroupId)) {
      modelContainer.put("groupId", cursor.getLong(indexgroupId));
    } else {
      modelContainer.putDefault("groupId");
    }
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexaccountNo = cursor.getColumnIndex("accountNo");
    if (indexaccountNo != -1 && !cursor.isNull(indexaccountNo)) {
      modelContainer.put("accountNo", cursor.getString(indexaccountNo));
    } else {
      modelContainer.putDefault("accountNo");
    }
    int indexexternalId = cursor.getColumnIndex("externalId");
    if (indexexternalId != -1 && !cursor.isNull(indexexternalId)) {
      modelContainer.put("externalId", cursor.getString(indexexternalId));
    } else {
      modelContainer.putDefault("externalId");
    }
    int indexproductId = cursor.getColumnIndex("productId");
    if (indexproductId != -1 && !cursor.isNull(indexproductId)) {
      modelContainer.put("productId", cursor.getInt(indexproductId));
    } else {
      modelContainer.putDefault("productId");
    }
    int indexproductName = cursor.getColumnIndex("productName");
    if (indexproductName != -1 && !cursor.isNull(indexproductName)) {
      modelContainer.put("productName", cursor.getString(indexproductName));
    } else {
      modelContainer.putDefault("productName");
    }
    //// Only load model if references match, for efficiency
    int indexstatus_id = cursor.getColumnIndex("status_id");
    if (indexstatus_id != -1 && !cursor.isNull(indexstatus_id)) {
      modelContainer.put("status", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.Status.class).where()
          .and(com.mifos.objects.accounts.loan.Status_Table.id.eq(cursor.getInt(indexstatus_id))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.loan.Status.class)).getData());
    } else {
      modelContainer.putDefault("status");
    }
    //// Only load model if references match, for efficiency
    int indexloanType_id = cursor.getColumnIndex("loanType_id");
    if (indexloanType_id != -1 && !cursor.isNull(indexloanType_id)) {
      modelContainer.put("loanType", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.LoanType.class).where()
          .and(com.mifos.objects.accounts.loan.LoanType_Table.id.eq(cursor.getInt(indexloanType_id))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.loan.LoanType.class)).getData());
    } else {
      modelContainer.putDefault("loanType");
    }
    int indexloanCycle = cursor.getColumnIndex("loanCycle");
    if (indexloanCycle != -1 && !cursor.isNull(indexloanCycle)) {
      modelContainer.put("loanCycle", cursor.getInt(indexloanCycle));
    } else {
      modelContainer.putDefault("loanCycle");
    }
    int indexinArrears = cursor.getColumnIndex("inArrears");
    if (indexinArrears != -1 && !cursor.isNull(indexinArrears)) {
      modelContainer.put("inArrears", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexinArrears)));
    } else {
      modelContainer.putDefault("inArrears");
    }
  }

  @Override
  public final ForeignKeyContainer<LoanAccount> toForeignKeyContainer(LoanAccount model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(LoanAccount.class);
    modelContainer.put(LoanAccount_Table.id, model.id);
    return modelContainer;
  }
}
