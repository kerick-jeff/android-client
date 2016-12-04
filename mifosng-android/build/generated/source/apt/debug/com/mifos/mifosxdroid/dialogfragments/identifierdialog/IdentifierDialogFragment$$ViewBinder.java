// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.dialogfragments.identifierdialog;

import android.content.res.Resources;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;
import java.lang.SuppressWarnings;

public class IdentifierDialogFragment$$ViewBinder<T extends IdentifierDialogFragment> implements ViewBinder<T> {
  @Override
  @SuppressWarnings("ResourceType")
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558601, "field 'sp_identifier_type'");
    target.sp_identifier_type = finder.castView(view, 2131558601, "field 'sp_identifier_type'");
    view = finder.findRequiredView(source, 2131558603, "field 'sp_identifier_status'");
    target.sp_identifier_status = finder.castView(view, 2131558603, "field 'sp_identifier_status'");
    view = finder.findRequiredView(source, 2131558607, "field 'et_description'");
    target.et_description = finder.castView(view, 2131558607, "field 'et_description'");
    view = finder.findRequiredView(source, 2131558605, "field 'et_unique_id'");
    target.et_unique_id = finder.castView(view, 2131558605, "field 'et_unique_id'");
    view = finder.findRequiredView(source, 2131558608, "method 'onClickCreateIdentifier'");
    unbinder.view2131558608 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickCreateIdentifier();
      }
    });
    Resources res = finder.getContext(source).getResources();
    target.identifierStatus = res.getStringArray(2131427330);
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends IdentifierDialogFragment> implements Unbinder {
    private T target;

    View view2131558608;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.sp_identifier_type = null;
      target.sp_identifier_status = null;
      target.et_description = null;
      target.et_unique_id = null;
      view2131558608.setOnClickListener(null);
    }
  }
}
