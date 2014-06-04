package org.wikipedia.beta.analytics;

import org.wikipedia.beta.PageTitle;
import org.wikipedia.beta.WikipediaApp;

import java.util.Hashtable;

/**
 * Creates and stores analytics tracking funnels.
 */
public class FunnelManager {
    private final WikipediaApp app;
    private final Hashtable<PageTitle, EditFunnel> editFunnels = new Hashtable<PageTitle, EditFunnel>();

    public FunnelManager(WikipediaApp app) {
        this.app = app;
    }

    public EditFunnel getEditFunnel(PageTitle title) {
        if (!editFunnels.containsKey(title)) {
            editFunnels.put(title, new EditFunnel(app, title));
        }

        return editFunnels.get(title);
    }
}