package org.howard.edu.lsp.assignment5;

import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherFactory;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

public class Driver {

	public static void main(String[] args) {
	    LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
	        .selectors(
	            selectClass(IntegerSetTest.class)
	        )
	        .build();

	    Launcher launcher = LauncherFactory.create();
	    SummaryGeneratingListener listener = new SummaryGeneratingListener();
	    launcher.registerTestExecutionListeners(listener);
	    launcher.execute(request);

	    // Access the summary details and print them out
	    String summary = listener.getSummary().getTestsSucceededCount() + " tests succeeded, "
	                   + listener.getSummary().getTestsFailedCount() + " tests failed, "
	                   + listener.getSummary().getTestsSkippedCount() + " tests skipped.";
	    System.out.println(summary);
	}


}