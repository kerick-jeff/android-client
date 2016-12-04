// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.dialogfragments.documentdialog;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class DocumentDialogFragment$$ViewBinder<T extends DocumentDialogFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558594, "field 'tv_document_action'");
    target.tv_document_action = finder.castView(view, 2131558594, "field 'tv_document_action'");
    view = finder.findRequiredView(source, 2131558595, "field 'et_document_name'");
    target.et_document_name = finder.castView(view, 2131558595, "field 'et_document_name'");
    view = finder.findRequiredView(source, 2131558597, "field 'et_document_description'");
    target.et_document_description = finder.castView(view, 2131558597, "field 'et_document_description'");
    view = finder.findRequiredView(source, 2131558598, "field 'tv_choose_file' and method 'openFilePicker'");
    target.tv_choose_file = finder.castView(view, 2131558598, "field 'tv_choose_file'");
    unbinder.view2131558598 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openFilePicker();
      }
    });
    view = finder.findRequiredView(source, 2131558599, "field 'bt_upload' and method 'beginUpload'");
    target.bt_upload = finder.castView(view, 2131558599, "field 'bt_upload'");
    unbinder.view2131558599 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.beginUpload();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends DocumentDialogFragment> implements Unbinder {
    private T target;

    View view2131558598;

    View view2131558599;

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
      target.tv_document_action = null;
      target.et_document_name = null;
      target.et_document_description = null;
      view2131558598.setOnClickListener(null);
      target.tv_choose_file = null;
      view2131558599.setOnClickListener(null);
      target.bt_upload = null;
    }
  }
}
