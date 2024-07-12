package com.example

import com.morpheusdata.core.AbstractClusterTabProvider
import com.morpheusdata.core.MorpheusContext
import com.morpheusdata.core.Plugin
import com.morpheusdata.model.Account
import com.morpheusdata.model.ComputeServerGroup
import com.morpheusdata.model.User
import com.morpheusdata.views.HTMLResponse
import com.morpheusdata.views.ViewModel

class ViewerClusterTabProvider extends AbstractClusterTabProvider {
	protected MorpheusContext morpheusContext
	protected Plugin plugin
    String code = 'viewer'

    ViewerClusterTabProvider(Plugin plugin, MorpheusContext morpheusContext) {
        this.@morpheusContext = morpheusContext
        this.@plugin = plugin
    }

	/**
	 * Cluster details provided to your rendering engine
	 * @param cluster details
	 * @return result of rendering a template
	 */
	@Override
	HTMLResponse renderTemplate(ComputeServerGroup cluster) {
		ViewModel<ComputeServerGroup> model = new ViewModel()
        def HashMap<String, String> viewerPayload = new HashMap<String, String>();
        viewerPayload.put('cluster', cluster)
        viewerPayload.put('nonce', this.@morpheusContext.getWebRequest())
        //viewerPayload.put('request', request)
		model.object = viewerPayload
        println "GET WEB REQUEST: ${}"
		return getRenderer().renderTemplate("hbs/clusterTab", model)
	}

	/**
	 * Provide logic when tab should be displayed. This logic is checked after permissions are validated.
	 *
	 * @param cluster Cluster details
	 * @param user current User details
	 * @param account Account details
	 * @return whether the tab should be displayed
	 */
	@Override
	Boolean show(ComputeServerGroup cluster, User user, Account account) {
		return true
	}

	/**
	 * Returns the Morpheus Context for interacting with data stored in the Main Morpheus Application
	 *
	 * @return an implementation of the MorpheusContext for running Future based rxJava queries
	 */
	@Override
	MorpheusContext getMorpheus() {
		return this.@morpheusContext
	}

	/**
	 * Returns the instance of the Plugin class that this provider is loaded from
	 * @return Plugin class contains references to other providers
	 */
	@Override
	Plugin getPlugin() {
		return this.@plugin
	}

	/**
	 * A unique shortcode used for referencing the provided provider. Make sure this is going to be unique as any data
	 * that is seeded or generated related to this provider will reference it by this code.
	 * @return short code string that should be unique across all other plugin implementations.
	 */
	@Override
	String getCode() {
		return 'viewer-instanceTab'
	}

	/**
	 * Provides the provider name for reference when adding to the Morpheus Orchestrator
	 * NOTE: This may be useful to set as an i18n key for UI reference and localization support.
	 *
	 * @return either an English name of a Provider or an i18n based key that can be scanned for in a properties file.
	 */
	@Override
	String getName() {
		return 'Viewer'
	}
}
