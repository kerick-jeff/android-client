// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.clientlist;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ClientListFragment$$ViewBinder<T extends ClientListFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558687, "field 'rv_clients'");
    target.rv_clients = finder.castView(view, 2131558687, "field 'rv_clients'");
    view = finder.findRequiredView(source, 2131558678, "field 'swipeRefreshLayout'");
    target.swipeRefreshLayout = finder.castView(view, 2131558678, "field 'swipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131558689, "field 'mNoClientText'");
    target.mNoClientText = finder.castView(view, 2131558689, "field 'mNoClientText'");
    view = finder.findRequiredView(source, 2131558681, "field 'll_error'");
    target.ll_error = finder.castView(view, 2131558681, "field 'll_error'");
    view = finder.findRequiredView(source, 2131558688, "field 'mNoClientIcon' and method 'reloadOnError'");
    target.mNoClientIcon = finder.castView(view, 2131558688, "field 'mNoClientIcon'");
    unbinder.view2131558688 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.reloadOnError();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ClientListFragment> implements Unbinder {
    private T target;

    View view2131558688;

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
      target.rv_clients = null;
      target.swipeRefreshLayout = null;
      target.mNoClientText = null;
      target.ll_error = null;
      view2131558688.setOnClickListener(null);
      target.mNoClientIcon = null;
    }
  }
}
