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
public final class LoanWithAssociations_Container extends ModelContainerAdapter<LoanWithAssociations> {
  public LoanWithAssociations_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("accountNo", String.class);
    columnMap.put("status", Status.class);
    columnMap.put("clientName", String.class);
    columnMap.put("loanProductName", String.class);
    columnMap.put("loanOfficerName", String.class);
    columnMap.put("timeline", Timeline.class);
    columnMap.put("summary", Summary.class);
  }

  @Override
  public final Class<LoanWithAssociations> getModelClass() {
    return LoanWithAssociations.class;
  }

  public final String getTableName() {
    return "`LoanWithAssociations`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<LoanWithAssociations, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(LoanWithAssociations_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(LoanWithAssociations_Table.id.getCursorKey());
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      values.put(LoanWithAssociations_Table.accountNo.getCursorKey(), modelContaineraccountNo);
    } else {
      values.putNull(LoanWithAssociations_Table.accountNo.getCursorKey());
    }
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.loan.Status.class);
    if (refstatus != null) {
      refstatus.save();
      Integer refstatusid = refstatus.getIntegerValue("id");
      if (refstatusid != null) {
        values.put(LoanWithAssociations_Table.status_id.getCursorKey(), refstatusid);
      } else {
        values.putNull(LoanWithAssociations_Table.status_id.getCursorKey());
      }
    } else {
      values.putNull("`status_id`");
    }
    String modelContainerclientName = modelContainer.getStringValue("clientName");
    if (modelContainerclientName != null) {
      values.put(LoanWithAssociations_Table.clientName.getCursorKey(), modelContainerclientName);
    } else {
      values.putNull(LoanWithAssociations_Table.clientName.getCursorKey());
    }
    String modelContainerloanProductName = modelContainer.getStringValue("loanProductName");
    if (modelContainerloanProductName != null) {
      values.put(LoanWithAssociations_Table.loanProductName.getCursorKey(), modelContainerloanProductName);
    } else {
      values.putNull(LoanWithAssociations_Table.loanProductName.getCursorKey());
    }
    String modelContainerloanOfficerName = modelContainer.getStringValue("loanOfficerName");
    if (modelContainerloanOfficerName != null) {
      values.put(LoanWithAssociations_Table.loanOfficerName.getCursorKey(), modelContainerloanOfficerName);
    } else {
      values.putNull(LoanWithAssociations_Table.loanOfficerName.getCursorKey());
    }
    ModelContainer<Timeline, ?> reftimeline = modelContainer.getInstance(modelContainer.getValue("timeline"), com.mifos.objects.accounts.loan.Timeline.class);
    if (reftimeline != null) {
      reftimeline.save();
      Integer reftimelineloanId = reftimeline.getIntegerValue("loanId");
      if (reftimelineloanId != null) {
        values.put(LoanWithAssociations_Table.timeline_loanId.getCursorKey(), reftimelineloanId);
      } else {
        values.putNull(LoanWithAssociations_Table.timeline_loanId.getCursorKey());
      }
    } else {
      values.putNull("`timeline_loanId`");
    }
    ModelContainer<Summary, ?> refsummary = modelContainer.getInstance(modelContainer.getValue("summary"), com.mifos.objects.accounts.loan.Summary.class);
    if (refsummary != null) {
      refsummary.save();
      Integer refsummaryloanId = refsummary.getIntegerValue("loanId");
      if (refsummaryloanId != null) {
        values.put(LoanWithAssociations_Table.summary_loanId.getCursorKey(), refsummaryloanId);
      } else {
        values.putNull(LoanWithAssociations_Table.summary_loanId.getCursorKey());
      }
    } else {
      values.putNull("`summary_loanId`");
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<LoanWithAssociations, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<LoanWithAssociations, ?> modelContainer, int start) {
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
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.loan.Status.class);
    if (refstatus != null) {
      refstatus.save();
      Integer refstatusid = refstatus.getIntegerValue("id");
      if (refstatusid != null) {
        statement.bindLong(3 + start, refstatusid);
      } else {
        statement.bindNull(3 + start);
      }
    } else {
      statement.bindNull(3 + start);
    }
    String modelContainerclientName = modelContainer.getStringValue("clientName");
    if (modelContainerclientName != null) {
      statement.bindString(4 + start, modelContainerclientName);
    } else {
      statement.bindNull(4 + start);
    }
    String modelContainerloanProductName = modelContainer.getStringValue("loanProductName");
    if (modelContainerloanProductName != null) {
      statement.bindString(5 + start, modelContainerloanProductName);
    } else {
      statement.bindNull(5 + start);
    }
    String modelContainerloanOfficerName = modelContainer.getStringValue("loanOfficerName");
    if (modelContainerloanOfficerName != null) {
      statement.bindString(6 + start, modelContainerloanOfficerName);
    } else {
      statement.bindNull(6 + start);
    }
    ModelContainer<Timeline, ?> reftimeline = modelContainer.getInstance(modelContainer.getValue("timeline"), com.mifos.objects.accounts.loan.Timeline.class);
    if (reftimeline != null) {
      reftimeline.save();
      Integer reftimelineloanId = reftimeline.getIntegerValue("loanId");
      if (reftimelineloanId != null) {
        statement.bindLong(7 + start, reftimelineloanId);
      } else {
        statement.bindNull(7 + start);
      }
    } else {
      statement.bindNull(7 + start);
    }
    ModelContainer<Summary, ?> refsummary = modelContainer.getInstance(modelContainer.getValue("summary"), com.mifos.objects.accounts.loan.Summary.class);
    if (refsummary != null) {
      refsummary.save();
      Integer refsummaryloanId = refsummary.getIntegerValue("loanId");
      if (refsummaryloanId != null) {
        statement.bindLong(8 + start, refsummaryloanId);
      } else {
        statement.bindNull(8 + start);
      }
    } else {
      statement.bindNull(8 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<LoanWithAssociations, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<LoanWithAssociations, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(LoanWithAssociations.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<LoanWithAssociations, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(LoanWithAssociations_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final LoanWithAssociations toModel(ModelContainer<LoanWithAssociations, ?> modelContainer) {
    LoanWithAssociations model = new LoanWithAssociations();
    model.id = modelContainer.getIntegerValue("id");
    model.accountNo = modelContainer.getStringValue("accountNo");
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.accounts.loan.Status.class);
    if (refstatus != null) {
      model.status = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.loan.Status.class).toModel(refstatus);
    }
    model.clientName = modelContainer.getStringValue("clientName");
    model.loanProductName = modelContainer.getStringValue("loanProductName");
    model.loanOfficerName = modelContainer.getStringValue("loanOfficerName");
    ModelContainer<Timeline, ?> reftimeline = modelContainer.getInstance(modelContainer.getValue("timeline"), com.mifos.objects.accounts.loan.Timeline.class);
    if (reftimeline != null) {
      model.timeline = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.loan.Timeline.class).toModel(reftimeline);
    }
    ModelContainer<Summary, ?> refsummary = modelContainer.getInstance(modelContainer.getValue("summary"), com.mifos.objects.accounts.loan.Summary.class);
    if (refsummary != null) {
      model.summary = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.loan.Summary.class).toModel(refsummary);
    }
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<LoanWithAssociations, ?> modelContainer) {
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
    //// Only load model if references match, for efficiency
    int indexstatus_id = cursor.getColumnIndex("status_id");
    if (indexstatus_id != -1 && !cursor.isNull(indexstatus_id)) {
      modelContainer.put("status", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.Status.class).where()
          .and(com.mifos.objects.accounts.loan.Status_Table.id.eq(cursor.getInt(indexstatus_id))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.loan.Status.class)).getData());
    } else {
      modelContainer.putDefault("status");
    }
    int indexclientName = cursor.getColumnIndex("clientName");
    if (indexclientName != -1 && !cursor.isNull(indexclientName)) {
      modelContainer.put("clientName", cursor.getString(indexclientName));
    } else {
      modelContainer.putDefault("clientName");
    }
    int indexloanProductName = cursor.getColumnIndex("loanProductName");
    if (indexloanProductName != -1 && !cursor.isNull(indexloanProductName)) {
      modelContainer.put("loanProductName", cursor.getString(indexloanProductName));
    } else {
      modelContainer.putDefault("loanProductName");
    }
    int indexloanOfficerName = cursor.getColumnIndex("loanOfficerName");
    if (indexloanOfficerName != -1 && !cursor.isNull(indexloanOfficerName)) {
      modelContainer.put("loanOfficerName", cursor.getString(indexloanOfficerName));
    } else {
      modelContainer.putDefault("loanOfficerName");
    }
    //// Only load model if references match, for efficiency
    int indextimeline_loanId = cursor.getColumnIndex("timeline_loanId");
    if (indextimeline_loanId != -1 && !cursor.isNull(indextimeline_loanId)) {
      modelContainer.put("timeline", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.Timeline.class).where()
          .and(com.mifos.objects.accounts.loan.Timeline_Table.loanId.eq(cursor.getInt(indextimeline_loanId))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.loan.Timeline.class)).getData());
    } else {
      modelContainer.putDefault("timeline");
    }
    //// Only load model if references match, for efficiency
    int indexsummary_loanId = cursor.getColumnIndex("summary_loanId");
    if (indexsummary_loanId != -1 && !cursor.isNull(indexsummary_loanId)) {
      modelContainer.put("summary", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.Summary.class).where()
          .and(com.mifos.objects.accounts.loan.Summary_Table.loanId.eq(cursor.getInt(indexsummary_loanId))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.loan.Summary.class)).getData());
    } else {
      modelContainer.putDefault("summary");
    }
  }

  @Override
  public final ForeignKeyContainer<LoanWithAssociations> toForeignKeyContainer(LoanWithAssociations model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(LoanWithAssociations.class);
    modelContainer.put(LoanWithAssociations_Table.id, model.id);
    return modelContainer;
  }
}
