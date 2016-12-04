package com.mifos.objects.client;

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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Charges_Container extends ModelContainerAdapter<Charges> {
  public Charges_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("clientId", Integer.class);
    columnMap.put("loanId", Integer.class);
    columnMap.put("chargeId", Integer.class);
    columnMap.put("name", String.class);
    columnMap.put("chargeTimeType", ChargeTimeType.class);
    columnMap.put("chargeDueDate", ClientDate.class);
    columnMap.put("chargeCalculationType", ChargeCalculationType.class);
    columnMap.put("currency", Currency.class);
    columnMap.put("amount", Double.class);
    columnMap.put("amountPaid", Double.class);
    columnMap.put("amountWaived", Double.class);
    columnMap.put("amountWrittenOff", Double.class);
    columnMap.put("amountOutstanding", Double.class);
    columnMap.put("penalty", Boolean.class);
    columnMap.put("isActive", Boolean.class);
    columnMap.put("isPaid", Boolean.class);
    columnMap.put("isWaived", Boolean.class);
  }

  @Override
  public final Class<Charges> getModelClass() {
    return Charges.class;
  }

  public final String getTableName() {
    return "`Charges`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Charges, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(Charges_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(Charges_Table.id.getCursorKey());
    }
    Integer modelContainerclientId = modelContainer.getIntegerValue("clientId");
    if (modelContainerclientId != null) {
      values.put(Charges_Table.clientId.getCursorKey(), modelContainerclientId);
    } else {
      values.putNull(Charges_Table.clientId.getCursorKey());
    }
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      values.put(Charges_Table.loanId.getCursorKey(), modelContainerloanId);
    } else {
      values.putNull(Charges_Table.loanId.getCursorKey());
    }
    Integer modelContainerchargeId = modelContainer.getIntegerValue("chargeId");
    if (modelContainerchargeId != null) {
      values.put(Charges_Table.chargeId.getCursorKey(), modelContainerchargeId);
    } else {
      values.putNull(Charges_Table.chargeId.getCursorKey());
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      values.put(Charges_Table.name.getCursorKey(), modelContainername);
    } else {
      values.putNull(Charges_Table.name.getCursorKey());
    }
    ModelContainer<ChargeTimeType, ?> refchargeTimeType = modelContainer.getInstance(modelContainer.getValue("chargeTimeType"), com.mifos.objects.client.ChargeTimeType.class);
    if (refchargeTimeType != null) {
      refchargeTimeType.save();
      Integer refchargeTimeTypeid = refchargeTimeType.getIntegerValue("id");
      if (refchargeTimeTypeid != null) {
        values.put(Charges_Table.chargeTimeType_id.getCursorKey(), refchargeTimeTypeid);
      } else {
        values.putNull(Charges_Table.chargeTimeType_id.getCursorKey());
      }
    } else {
      values.putNull("`chargeTimeType_id`");
    }
    ModelContainer<ClientDate, ?> refchargeDueDate = modelContainer.getInstance(modelContainer.getValue("chargeDueDate"), com.mifos.objects.client.ClientDate.class);
    if (refchargeDueDate != null) {
      refchargeDueDate.save();
      values.put(Charges_Table.chargeDueDate_clientId.getCursorKey(), refchargeDueDate.getLngValue("clientId"));
      values.put(Charges_Table.chargeDueDate_chargeId.getCursorKey(), refchargeDueDate.getLngValue("chargeId"));
    } else {
      values.putNull("`chargeDueDate_clientId`");
      values.putNull("`chargeDueDate_chargeId`");
    }
    ModelContainer<ChargeCalculationType, ?> refchargeCalculationType = modelContainer.getInstance(modelContainer.getValue("chargeCalculationType"), com.mifos.objects.client.ChargeCalculationType.class);
    if (refchargeCalculationType != null) {
      refchargeCalculationType.save();
      Integer refchargeCalculationTypeid = refchargeCalculationType.getIntegerValue("id");
      if (refchargeCalculationTypeid != null) {
        values.put(Charges_Table.chargeCalculationType_id.getCursorKey(), refchargeCalculationTypeid);
      } else {
        values.putNull(Charges_Table.chargeCalculationType_id.getCursorKey());
      }
    } else {
      values.putNull("`chargeCalculationType_id`");
    }
    ModelContainer<Currency, ?> refcurrency = modelContainer.getInstance(modelContainer.getValue("currency"), com.mifos.objects.client.Currency.class);
    if (refcurrency != null) {
      refcurrency.save();
      String refcurrencycode = refcurrency.getStringValue("code");
      if (refcurrencycode != null) {
        values.put(Charges_Table.currency_code.getCursorKey(), refcurrencycode);
      } else {
        values.putNull(Charges_Table.currency_code.getCursorKey());
      }
    } else {
      values.putNull("`currency_code`");
    }
    Double modelContaineramount = modelContainer.getDoubleValue("amount");
    if (modelContaineramount != null) {
      values.put(Charges_Table.amount.getCursorKey(), modelContaineramount);
    } else {
      values.putNull(Charges_Table.amount.getCursorKey());
    }
    Double modelContaineramountPaid = modelContainer.getDoubleValue("amountPaid");
    if (modelContaineramountPaid != null) {
      values.put(Charges_Table.amountPaid.getCursorKey(), modelContaineramountPaid);
    } else {
      values.putNull(Charges_Table.amountPaid.getCursorKey());
    }
    Double modelContaineramountWaived = modelContainer.getDoubleValue("amountWaived");
    if (modelContaineramountWaived != null) {
      values.put(Charges_Table.amountWaived.getCursorKey(), modelContaineramountWaived);
    } else {
      values.putNull(Charges_Table.amountWaived.getCursorKey());
    }
    Double modelContaineramountWrittenOff = modelContainer.getDoubleValue("amountWrittenOff");
    if (modelContaineramountWrittenOff != null) {
      values.put(Charges_Table.amountWrittenOff.getCursorKey(), modelContaineramountWrittenOff);
    } else {
      values.putNull(Charges_Table.amountWrittenOff.getCursorKey());
    }
    Double modelContaineramountOutstanding = modelContainer.getDoubleValue("amountOutstanding");
    if (modelContaineramountOutstanding != null) {
      values.put(Charges_Table.amountOutstanding.getCursorKey(), modelContaineramountOutstanding);
    } else {
      values.putNull(Charges_Table.amountOutstanding.getCursorKey());
    }
    Integer modelContainerpenalty = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("penalty"));
    if (modelContainerpenalty != null) {
      values.put(Charges_Table.penalty.getCursorKey(), modelContainerpenalty);
    } else {
      values.putNull(Charges_Table.penalty.getCursorKey());
    }
    Integer modelContainerisActive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isActive"));
    if (modelContainerisActive != null) {
      values.put(Charges_Table.isActive.getCursorKey(), modelContainerisActive);
    } else {
      values.putNull(Charges_Table.isActive.getCursorKey());
    }
    Integer modelContainerisPaid = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isPaid"));
    if (modelContainerisPaid != null) {
      values.put(Charges_Table.isPaid.getCursorKey(), modelContainerisPaid);
    } else {
      values.putNull(Charges_Table.isPaid.getCursorKey());
    }
    Integer modelContainerisWaived = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isWaived"));
    if (modelContainerisWaived != null) {
      values.put(Charges_Table.isWaived.getCursorKey(), modelContainerisWaived);
    } else {
      values.putNull(Charges_Table.isWaived.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Charges, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Charges, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    Integer modelContainerclientId = modelContainer.getIntegerValue("clientId");
    if (modelContainerclientId != null) {
      statement.bindLong(2 + start, modelContainerclientId);
    } else {
      statement.bindNull(2 + start);
    }
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      statement.bindLong(3 + start, modelContainerloanId);
    } else {
      statement.bindNull(3 + start);
    }
    Integer modelContainerchargeId = modelContainer.getIntegerValue("chargeId");
    if (modelContainerchargeId != null) {
      statement.bindLong(4 + start, modelContainerchargeId);
    } else {
      statement.bindNull(4 + start);
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      statement.bindString(5 + start, modelContainername);
    } else {
      statement.bindNull(5 + start);
    }
    ModelContainer<ChargeTimeType, ?> refchargeTimeType = modelContainer.getInstance(modelContainer.getValue("chargeTimeType"), com.mifos.objects.client.ChargeTimeType.class);
    if (refchargeTimeType != null) {
      refchargeTimeType.save();
      Integer refchargeTimeTypeid = refchargeTimeType.getIntegerValue("id");
      if (refchargeTimeTypeid != null) {
        statement.bindLong(6 + start, refchargeTimeTypeid);
      } else {
        statement.bindNull(6 + start);
      }
    } else {
      statement.bindNull(6 + start);
    }
    ModelContainer<ClientDate, ?> refchargeDueDate = modelContainer.getInstance(modelContainer.getValue("chargeDueDate"), com.mifos.objects.client.ClientDate.class);
    if (refchargeDueDate != null) {
      refchargeDueDate.save();
      statement.bindLong(7 + start, refchargeDueDate.getLngValue("clientId"));
      statement.bindLong(8 + start, refchargeDueDate.getLngValue("chargeId"));
    } else {
      statement.bindNull(7 + start);
      statement.bindNull(8 + start);
    }
    ModelContainer<ChargeCalculationType, ?> refchargeCalculationType = modelContainer.getInstance(modelContainer.getValue("chargeCalculationType"), com.mifos.objects.client.ChargeCalculationType.class);
    if (refchargeCalculationType != null) {
      refchargeCalculationType.save();
      Integer refchargeCalculationTypeid = refchargeCalculationType.getIntegerValue("id");
      if (refchargeCalculationTypeid != null) {
        statement.bindLong(9 + start, refchargeCalculationTypeid);
      } else {
        statement.bindNull(9 + start);
      }
    } else {
      statement.bindNull(9 + start);
    }
    ModelContainer<Currency, ?> refcurrency = modelContainer.getInstance(modelContainer.getValue("currency"), com.mifos.objects.client.Currency.class);
    if (refcurrency != null) {
      refcurrency.save();
      String refcurrencycode = refcurrency.getStringValue("code");
      if (refcurrencycode != null) {
        statement.bindString(10 + start, refcurrencycode);
      } else {
        statement.bindNull(10 + start);
      }
    } else {
      statement.bindNull(10 + start);
    }
    Double modelContaineramount = modelContainer.getDoubleValue("amount");
    if (modelContaineramount != null) {
      statement.bindDouble(11 + start, modelContaineramount);
    } else {
      statement.bindNull(11 + start);
    }
    Double modelContaineramountPaid = modelContainer.getDoubleValue("amountPaid");
    if (modelContaineramountPaid != null) {
      statement.bindDouble(12 + start, modelContaineramountPaid);
    } else {
      statement.bindNull(12 + start);
    }
    Double modelContaineramountWaived = modelContainer.getDoubleValue("amountWaived");
    if (modelContaineramountWaived != null) {
      statement.bindDouble(13 + start, modelContaineramountWaived);
    } else {
      statement.bindNull(13 + start);
    }
    Double modelContaineramountWrittenOff = modelContainer.getDoubleValue("amountWrittenOff");
    if (modelContaineramountWrittenOff != null) {
      statement.bindDouble(14 + start, modelContaineramountWrittenOff);
    } else {
      statement.bindNull(14 + start);
    }
    Double modelContaineramountOutstanding = modelContainer.getDoubleValue("amountOutstanding");
    if (modelContaineramountOutstanding != null) {
      statement.bindDouble(15 + start, modelContaineramountOutstanding);
    } else {
      statement.bindNull(15 + start);
    }
    Integer modelContainerpenalty = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("penalty"));
    if (modelContainerpenalty != null) {
      statement.bindLong(16 + start, modelContainerpenalty);
    } else {
      statement.bindNull(16 + start);
    }
    Integer modelContainerisActive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isActive"));
    if (modelContainerisActive != null) {
      statement.bindLong(17 + start, modelContainerisActive);
    } else {
      statement.bindNull(17 + start);
    }
    Integer modelContainerisPaid = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isPaid"));
    if (modelContainerisPaid != null) {
      statement.bindLong(18 + start, modelContainerisPaid);
    } else {
      statement.bindNull(18 + start);
    }
    Integer modelContainerisWaived = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isWaived"));
    if (modelContainerisWaived != null) {
      statement.bindLong(19 + start, modelContainerisWaived);
    } else {
      statement.bindNull(19 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Charges, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Charges, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Charges.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Charges, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Charges_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final Charges toModel(ModelContainer<Charges, ?> modelContainer) {
    Charges model = new Charges();
    model.id = modelContainer.getIntegerValue("id");
    model.clientId = modelContainer.getIntegerValue("clientId");
    model.loanId = modelContainer.getIntegerValue("loanId");
    model.chargeId = modelContainer.getIntegerValue("chargeId");
    model.name = modelContainer.getStringValue("name");
    ModelContainer<ChargeTimeType, ?> refchargeTimeType = modelContainer.getInstance(modelContainer.getValue("chargeTimeType"), com.mifos.objects.client.ChargeTimeType.class);
    if (refchargeTimeType != null) {
      model.chargeTimeType = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.client.ChargeTimeType.class).toModel(refchargeTimeType);
    }
    ModelContainer<ClientDate, ?> refchargeDueDate = modelContainer.getInstance(modelContainer.getValue("chargeDueDate"), com.mifos.objects.client.ClientDate.class);
    if (refchargeDueDate != null) {
      model.chargeDueDate = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.client.ClientDate.class).toModel(refchargeDueDate);
    }
    ModelContainer<ChargeCalculationType, ?> refchargeCalculationType = modelContainer.getInstance(modelContainer.getValue("chargeCalculationType"), com.mifos.objects.client.ChargeCalculationType.class);
    if (refchargeCalculationType != null) {
      model.chargeCalculationType = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.client.ChargeCalculationType.class).toModel(refchargeCalculationType);
    }
    ModelContainer<Currency, ?> refcurrency = modelContainer.getInstance(modelContainer.getValue("currency"), com.mifos.objects.client.Currency.class);
    if (refcurrency != null) {
      model.currency = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.client.Currency.class).toModel(refcurrency);
    }
    model.amount = modelContainer.getDoubleValue("amount");
    model.amountPaid = modelContainer.getDoubleValue("amountPaid");
    model.amountWaived = modelContainer.getDoubleValue("amountWaived");
    model.amountWrittenOff = modelContainer.getDoubleValue("amountWrittenOff");
    model.amountOutstanding = modelContainer.getDoubleValue("amountOutstanding");
    model.penalty = modelContainer.getBooleanValue("penalty");
    model.isActive = modelContainer.getBooleanValue("isActive");
    model.isPaid = modelContainer.getBooleanValue("isPaid");
    model.isWaived = modelContainer.getBooleanValue("isWaived");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Charges, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexclientId = cursor.getColumnIndex("clientId");
    if (indexclientId != -1 && !cursor.isNull(indexclientId)) {
      modelContainer.put("clientId", cursor.getInt(indexclientId));
    } else {
      modelContainer.putDefault("clientId");
    }
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      modelContainer.put("loanId", cursor.getInt(indexloanId));
    } else {
      modelContainer.putDefault("loanId");
    }
    int indexchargeId = cursor.getColumnIndex("chargeId");
    if (indexchargeId != -1 && !cursor.isNull(indexchargeId)) {
      modelContainer.put("chargeId", cursor.getInt(indexchargeId));
    } else {
      modelContainer.putDefault("chargeId");
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      modelContainer.put("name", cursor.getString(indexname));
    } else {
      modelContainer.putDefault("name");
    }
    //// Only load model if references match, for efficiency
    int indexchargeTimeType_id = cursor.getColumnIndex("chargeTimeType_id");
    if (indexchargeTimeType_id != -1 && !cursor.isNull(indexchargeTimeType_id)) {
      modelContainer.put("chargeTimeType", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.ChargeTimeType.class).where()
          .and(com.mifos.objects.client.ChargeTimeType_Table.id.eq(cursor.getInt(indexchargeTimeType_id))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.client.ChargeTimeType.class)).getData());
    } else {
      modelContainer.putDefault("chargeTimeType");
    }
    //// Only load model if references match, for efficiency
    int indexchargeDueDate_clientId = cursor.getColumnIndex("chargeDueDate_clientId");
    int indexchargeDueDate_chargeId = cursor.getColumnIndex("chargeDueDate_chargeId");
    if (indexchargeDueDate_clientId != -1 && !cursor.isNull(indexchargeDueDate_clientId) && indexchargeDueDate_chargeId != -1 && !cursor.isNull(indexchargeDueDate_chargeId)) {
      modelContainer.put("chargeDueDate", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.ClientDate.class).where()
          .and(com.mifos.objects.client.ClientDate_Table.clientId.eq(cursor.getLong(indexchargeDueDate_clientId)))
          .and(com.mifos.objects.client.ClientDate_Table.chargeId.eq(cursor.getLong(indexchargeDueDate_chargeId))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.client.ClientDate.class)).getData());
    } else {
      modelContainer.putDefault("chargeDueDate");
    }
    //// Only load model if references match, for efficiency
    int indexchargeCalculationType_id = cursor.getColumnIndex("chargeCalculationType_id");
    if (indexchargeCalculationType_id != -1 && !cursor.isNull(indexchargeCalculationType_id)) {
      modelContainer.put("chargeCalculationType", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.ChargeCalculationType.class).where()
          .and(com.mifos.objects.client.ChargeCalculationType_Table.id.eq(cursor.getInt(indexchargeCalculationType_id))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.client.ChargeCalculationType.class)).getData());
    } else {
      modelContainer.putDefault("chargeCalculationType");
    }
    //// Only load model if references match, for efficiency
    int indexcurrency_code = cursor.getColumnIndex("currency_code");
    if (indexcurrency_code != -1 && !cursor.isNull(indexcurrency_code)) {
      modelContainer.put("currency", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.Currency.class).where()
          .and(com.mifos.objects.client.Currency_Table.code.eq(cursor.getString(indexcurrency_code))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.client.Currency.class)).getData());
    } else {
      modelContainer.putDefault("currency");
    }
    int indexamount = cursor.getColumnIndex("amount");
    if (indexamount != -1 && !cursor.isNull(indexamount)) {
      modelContainer.put("amount", cursor.getDouble(indexamount));
    } else {
      modelContainer.putDefault("amount");
    }
    int indexamountPaid = cursor.getColumnIndex("amountPaid");
    if (indexamountPaid != -1 && !cursor.isNull(indexamountPaid)) {
      modelContainer.put("amountPaid", cursor.getDouble(indexamountPaid));
    } else {
      modelContainer.putDefault("amountPaid");
    }
    int indexamountWaived = cursor.getColumnIndex("amountWaived");
    if (indexamountWaived != -1 && !cursor.isNull(indexamountWaived)) {
      modelContainer.put("amountWaived", cursor.getDouble(indexamountWaived));
    } else {
      modelContainer.putDefault("amountWaived");
    }
    int indexamountWrittenOff = cursor.getColumnIndex("amountWrittenOff");
    if (indexamountWrittenOff != -1 && !cursor.isNull(indexamountWrittenOff)) {
      modelContainer.put("amountWrittenOff", cursor.getDouble(indexamountWrittenOff));
    } else {
      modelContainer.putDefault("amountWrittenOff");
    }
    int indexamountOutstanding = cursor.getColumnIndex("amountOutstanding");
    if (indexamountOutstanding != -1 && !cursor.isNull(indexamountOutstanding)) {
      modelContainer.put("amountOutstanding", cursor.getDouble(indexamountOutstanding));
    } else {
      modelContainer.putDefault("amountOutstanding");
    }
    int indexpenalty = cursor.getColumnIndex("penalty");
    if (indexpenalty != -1 && !cursor.isNull(indexpenalty)) {
      modelContainer.put("penalty", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexpenalty)));
    } else {
      modelContainer.putDefault("penalty");
    }
    int indexisActive = cursor.getColumnIndex("isActive");
    if (indexisActive != -1 && !cursor.isNull(indexisActive)) {
      modelContainer.put("isActive", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisActive)));
    } else {
      modelContainer.putDefault("isActive");
    }
    int indexisPaid = cursor.getColumnIndex("isPaid");
    if (indexisPaid != -1 && !cursor.isNull(indexisPaid)) {
      modelContainer.put("isPaid", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisPaid)));
    } else {
      modelContainer.putDefault("isPaid");
    }
    int indexisWaived = cursor.getColumnIndex("isWaived");
    if (indexisWaived != -1 && !cursor.isNull(indexisWaived)) {
      modelContainer.put("isWaived", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisWaived)));
    } else {
      modelContainer.putDefault("isWaived");
    }
  }

  @Override
  public final ForeignKeyContainer<Charges> toForeignKeyContainer(Charges model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Charges.class);
    modelContainer.put(Charges_Table.id, model.id);
    return modelContainer;
  }
}
