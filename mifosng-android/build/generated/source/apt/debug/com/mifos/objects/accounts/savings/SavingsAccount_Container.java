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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class SavingsAccount_Container extends ModelContainerAdapter<SavingsAccount> {
  public SavingsAccount_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("clientId", long.class);
    columnMap.put("groupId", long.class);
    columnMap.put("id", Integer.class);
    columnMap.put("accountNo", String.class);
    columnMap.put("productId", Integer.class);
    columnMap.put("productName", String.class);
    columnMap.put("status", Status.class);
    columnMap.put("currency", Currency.class);
    columnMap.put("accountBalance", Double.class);
    columnMap.put("depositType", DepositType.class);
  }

  @Override
  public final Class<SavingsAccount> getModelClass() {
    return SavingsAccount.class;
  }

  public final String getTableName() {
    return "`SavingsAccount`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<SavingsAccount, ?> modelContainer) {
    values.put(SavingsAccount_Table.clientId.getCursorKey(), modelContainer.getLngValue("clientId"));
    values.put(SavingsAccount_Table.groupId.getCursorKey(), modelContainer.getLngValue("groupId"));
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(SavingsAccount_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(SavingsAccount_Table.id.getCursorKey());
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      values.put(SavingsAccount_Table.accountNo.getCursorKey(), modelContaineraccountNo);
    } else {
      values.putNull(SavingsAccount_Table.accountNo.getCursorKey());
    }
    Integer modelContainerproductId = modelContainer.getIntegerValue("productId");
    if (modelContainerproductId != null) {
      values.put(SavingsAccount_Table.productId.getCursorKey(), modelContainerproductId);
    } else {
      values.putNull(SavingsAccount_Table.productId.getCursorKey());
    }
    String modelContainerproductName = modelContainer.getStringValue("productName");
    if (modelContainerproductName != null) {
      values.put(SavingsAccount_Table.productName.getCursorKey(), modelContainerproductName);
    } else {
      values.putNull(SavingsAccount_Table.productName.getCursorKey());
    }
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.savings.Status.class);
    if (refstatus != null) {
      refstatus.save();
      Integer refstatusid = refstatus.getIntegerValue("id");
      if (refstatusid != null) {
        values.put(SavingsAccount_Table.status_id.getCursorKey(), refstatusid);
      } else {
        values.putNull(SavingsAccount_Table.status_id.getCursorKey());
      }
    } else {
      values.putNull("`status_id`");
    }
    ModelContainer<Currency, ?> refcurrency = modelContainer.getInstance(modelContainer.getValue("currency"), com.mifos.objects.accounts.savings.Currency.class);
    if (refcurrency != null) {
      refcurrency.save();
      String refcurrencycode = refcurrency.getStringValue("code");
      if (refcurrencycode != null) {
        values.put(SavingsAccount_Table.currency_code.getCursorKey(), refcurrencycode);
      } else {
        values.putNull(SavingsAccount_Table.currency_code.getCursorKey());
      }
    } else {
      values.putNull("`currency_code`");
    }
    Double modelContaineraccountBalance = modelContainer.getDoubleValue("accountBalance");
    if (modelContaineraccountBalance != null) {
      values.put(SavingsAccount_Table.accountBalance.getCursorKey(), modelContaineraccountBalance);
    } else {
      values.putNull(SavingsAccount_Table.accountBalance.getCursorKey());
    }
    ModelContainer<DepositType, ?> refdepositType = modelContainer.getInstance(modelContainer.getValue("depositType"), com.mifos.objects.accounts.savings.DepositType.class);
    if (refdepositType != null) {
      refdepositType.save();
      Integer refdepositTypeid = refdepositType.getIntegerValue("id");
      if (refdepositTypeid != null) {
        values.put(SavingsAccount_Table.depositType_id.getCursorKey(), refdepositTypeid);
      } else {
        values.putNull(SavingsAccount_Table.depositType_id.getCursorKey());
      }
    } else {
      values.putNull("`depositType_id`");
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<SavingsAccount, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<SavingsAccount, ?> modelContainer, int start) {
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
    Integer modelContainerproductId = modelContainer.getIntegerValue("productId");
    if (modelContainerproductId != null) {
      statement.bindLong(5 + start, modelContainerproductId);
    } else {
      statement.bindNull(5 + start);
    }
    String modelContainerproductName = modelContainer.getStringValue("productName");
    if (modelContainerproductName != null) {
      statement.bindString(6 + start, modelContainerproductName);
    } else {
      statement.bindNull(6 + start);
    }
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.savings.Status.class);
    if (refstatus != null) {
      refstatus.save();
      Integer refstatusid = refstatus.getIntegerValue("id");
      if (refstatusid != null) {
        statement.bindLong(7 + start, refstatusid);
      } else {
        statement.bindNull(7 + start);
      }
    } else {
      statement.bindNull(7 + start);
    }
    ModelContainer<Currency, ?> refcurrency = modelContainer.getInstance(modelContainer.getValue("currency"), com.mifos.objects.accounts.savings.Currency.class);
    if (refcurrency != null) {
      refcurrency.save();
      String refcurrencycode = refcurrency.getStringValue("code");
      if (refcurrencycode != null) {
        statement.bindString(8 + start, refcurrencycode);
      } else {
        statement.bindNull(8 + start);
      }
    } else {
      statement.bindNull(8 + start);
    }
    Double modelContaineraccountBalance = modelContainer.getDoubleValue("accountBalance");
    if (modelContaineraccountBalance != null) {
      statement.bindDouble(9 + start, modelContaineraccountBalance);
    } else {
      statement.bindNull(9 + start);
    }
    ModelContainer<DepositType, ?> refdepositType = modelContainer.getInstance(modelContainer.getValue("depositType"), com.mifos.objects.accounts.savings.DepositType.class);
    if (refdepositType != null) {
      refdepositType.save();
      Integer refdepositTypeid = refdepositType.getIntegerValue("id");
      if (refdepositTypeid != null) {
        statement.bindLong(10 + start, refdepositTypeid);
      } else {
        statement.bindNull(10 + start);
      }
    } else {
      statement.bindNull(10 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<SavingsAccount, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<SavingsAccount, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingsAccount.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<SavingsAccount, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingsAccount_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final SavingsAccount toModel(ModelContainer<SavingsAccount, ?> modelContainer) {
    SavingsAccount model = new SavingsAccount();
    model.clientId = modelContainer.getLngValue("clientId");
    model.groupId = modelContainer.getLngValue("groupId");
    model.id = modelContainer.getIntegerValue("id");
    model.accountNo = modelContainer.getStringValue("accountNo");
    model.productId = modelContainer.getIntegerValue("productId");
    model.productName = modelContainer.getStringValue("productName");
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.savings.Status.class);
    if (refstatus != null) {
      model.status = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.savings.Status.class).toModel(refstatus);
    }
    ModelContainer<Currency, ?> refcurrency = modelContainer.getInstance(modelContainer.getValue("currency"), com.mifos.objects.accounts.savings.Currency.class);
    if (refcurrency != null) {
      model.currency = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.savings.Currency.class).toModel(refcurrency);
    }
    model.accountBalance = modelContainer.getDoubleValue("accountBalance");
    ModelContainer<DepositType, ?> refdepositType = modelContainer.getInstance(modelContainer.getValue("depositType"), com.mifos.objects.accounts.savings.DepositType.class);
    if (refdepositType != null) {
      model.depositType = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.savings.DepositType.class).toModel(refdepositType);
    }
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<SavingsAccount, ?> modelContainer) {
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
      modelContainer.put("status", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.Status.class).where()
          .and(com.mifos.objects.accounts.savings.Status_Table.id.eq(cursor.getInt(indexstatus_id))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.savings.Status.class)).getData());
    } else {
      modelContainer.putDefault("status");
    }
    //// Only load model if references match, for efficiency
    int indexcurrency_code = cursor.getColumnIndex("currency_code");
    if (indexcurrency_code != -1 && !cursor.isNull(indexcurrency_code)) {
      modelContainer.put("currency", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.Currency.class).where()
          .and(com.mifos.objects.accounts.savings.Currency_Table.code.eq(cursor.getString(indexcurrency_code))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.savings.Currency.class)).getData());
    } else {
      modelContainer.putDefault("currency");
    }
    int indexaccountBalance = cursor.getColumnIndex("accountBalance");
    if (indexaccountBalance != -1 && !cursor.isNull(indexaccountBalance)) {
      modelContainer.put("accountBalance", cursor.getDouble(indexaccountBalance));
    } else {
      modelContainer.putDefault("accountBalance");
    }
    //// Only load model if references match, for efficiency
    int indexdepositType_id = cursor.getColumnIndex("depositType_id");
    if (indexdepositType_id != -1 && !cursor.isNull(indexdepositType_id)) {
      modelContainer.put("depositType", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.DepositType.class).where()
          .and(com.mifos.objects.accounts.savings.DepositType_Table.id.eq(cursor.getInt(indexdepositType_id))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.savings.DepositType.class)).getData());
    } else {
      modelContainer.putDefault("depositType");
    }
  }

  @Override
  public final ForeignKeyContainer<SavingsAccount> toForeignKeyContainer(SavingsAccount model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(SavingsAccount.class);
    modelContainer.put(SavingsAccount_Table.id, model.id);
    return modelContainer;
  }
}
