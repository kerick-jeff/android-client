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
public final class SavingsAccountWithAssociations_Container extends ModelContainerAdapter<SavingsAccountWithAssociations> {
  public SavingsAccountWithAssociations_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("accountNo", String.class);
    columnMap.put("clientName", String.class);
    columnMap.put("savingsProductName", String.class);
    columnMap.put("status", Status.class);
    columnMap.put("summary", Summary.class);
  }

  @Override
  public final Class<SavingsAccountWithAssociations> getModelClass() {
    return SavingsAccountWithAssociations.class;
  }

  public final String getTableName() {
    return "`SavingsAccountWithAssociations`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<SavingsAccountWithAssociations, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(SavingsAccountWithAssociations_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(SavingsAccountWithAssociations_Table.id.getCursorKey());
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      values.put(SavingsAccountWithAssociations_Table.accountNo.getCursorKey(), modelContaineraccountNo);
    } else {
      values.putNull(SavingsAccountWithAssociations_Table.accountNo.getCursorKey());
    }
    String modelContainerclientName = modelContainer.getStringValue("clientName");
    if (modelContainerclientName != null) {
      values.put(SavingsAccountWithAssociations_Table.clientName.getCursorKey(), modelContainerclientName);
    } else {
      values.putNull(SavingsAccountWithAssociations_Table.clientName.getCursorKey());
    }
    String modelContainersavingsProductName = modelContainer.getStringValue("savingsProductName");
    if (modelContainersavingsProductName != null) {
      values.put(SavingsAccountWithAssociations_Table.savingsProductName.getCursorKey(), modelContainersavingsProductName);
    } else {
      values.putNull(SavingsAccountWithAssociations_Table.savingsProductName.getCursorKey());
    }
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.savings.Status.class);
    if (refstatus != null) {
      refstatus.save();
      Integer refstatusid = refstatus.getIntegerValue("id");
      if (refstatusid != null) {
        values.put(SavingsAccountWithAssociations_Table.status_id.getCursorKey(), refstatusid);
      } else {
        values.putNull(SavingsAccountWithAssociations_Table.status_id.getCursorKey());
      }
    } else {
      values.putNull("`status_id`");
    }
    ModelContainer<Summary, ?> refsummary = modelContainer.getInstance(modelContainer.getValue("summary"), com.mifos.objects.accounts.savings.Summary.class);
    if (refsummary != null) {
      refsummary.save();
      Integer refsummarysavingsId = refsummary.getIntegerValue("savingsId");
      if (refsummarysavingsId != null) {
        values.put(SavingsAccountWithAssociations_Table.summary_savingsId.getCursorKey(), refsummarysavingsId);
      } else {
        values.putNull(SavingsAccountWithAssociations_Table.summary_savingsId.getCursorKey());
      }
    } else {
      values.putNull("`summary_savingsId`");
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<SavingsAccountWithAssociations, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<SavingsAccountWithAssociations, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      statement.bindString(2 + start, modelContaineraccountNo);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainerclientName = modelContainer.getStringValue("clientName");
    if (modelContainerclientName != null) {
      statement.bindString(3 + start, modelContainerclientName);
    } else {
      statement.bindNull(3 + start);
    }
    String modelContainersavingsProductName = modelContainer.getStringValue("savingsProductName");
    if (modelContainersavingsProductName != null) {
      statement.bindString(4 + start, modelContainersavingsProductName);
    } else {
      statement.bindNull(4 + start);
    }
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.savings.Status.class);
    if (refstatus != null) {
      refstatus.save();
      Integer refstatusid = refstatus.getIntegerValue("id");
      if (refstatusid != null) {
        statement.bindLong(5 + start, refstatusid);
      } else {
        statement.bindNull(5 + start);
      }
    } else {
      statement.bindNull(5 + start);
    }
    ModelContainer<Summary, ?> refsummary = modelContainer.getInstance(modelContainer.getValue("summary"), com.mifos.objects.accounts.savings.Summary.class);
    if (refsummary != null) {
      refsummary.save();
      Integer refsummarysavingsId = refsummary.getIntegerValue("savingsId");
      if (refsummarysavingsId != null) {
        statement.bindLong(6 + start, refsummarysavingsId);
      } else {
        statement.bindNull(6 + start);
      }
    } else {
      statement.bindNull(6 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<SavingsAccountWithAssociations, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<SavingsAccountWithAssociations, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingsAccountWithAssociations.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<SavingsAccountWithAssociations, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingsAccountWithAssociations_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final SavingsAccountWithAssociations toModel(ModelContainer<SavingsAccountWithAssociations, ?> modelContainer) {
    SavingsAccountWithAssociations model = new SavingsAccountWithAssociations();
    model.id = modelContainer.getIntegerValue("id");
    model.accountNo = modelContainer.getStringValue("accountNo");
    model.clientName = modelContainer.getStringValue("clientName");
    model.savingsProductName = modelContainer.getStringValue("savingsProductName");
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.savings.Status.class);
    if (refstatus != null) {
      model.status = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.savings.Status.class).toModel(refstatus);
    }
    ModelContainer<Summary, ?> refsummary = modelContainer.getInstance(modelContainer.getValue("summary"), com.mifos.objects.accounts.savings.Summary.class);
    if (refsummary != null) {
      model.summary = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.savings.Summary.class).toModel(refsummary);
    }
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<SavingsAccountWithAssociations, ?> modelContainer) {
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
    int indexclientName = cursor.getColumnIndex("clientName");
    if (indexclientName != -1 && !cursor.isNull(indexclientName)) {
      modelContainer.put("clientName", cursor.getString(indexclientName));
    } else {
      modelContainer.putDefault("clientName");
    }
    int indexsavingsProductName = cursor.getColumnIndex("savingsProductName");
    if (indexsavingsProductName != -1 && !cursor.isNull(indexsavingsProductName)) {
      modelContainer.put("savingsProductName", cursor.getString(indexsavingsProductName));
    } else {
      modelContainer.putDefault("savingsProductName");
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
    int indexsummary_savingsId = cursor.getColumnIndex("summary_savingsId");
    if (indexsummary_savingsId != -1 && !cursor.isNull(indexsummary_savingsId)) {
      modelContainer.put("summary", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.Summary.class).where()
          .and(com.mifos.objects.accounts.savings.Summary_Table.savingsId.eq(cursor.getInt(indexsummary_savingsId))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.savings.Summary.class)).getData());
    } else {
      modelContainer.putDefault("summary");
    }
  }

  @Override
  public final ForeignKeyContainer<SavingsAccountWithAssociations> toForeignKeyContainer(SavingsAccountWithAssociations model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(SavingsAccountWithAssociations.class);
    modelContainer.put(SavingsAccountWithAssociations_Table.id, model.id);
    return modelContainer;
  }
}
