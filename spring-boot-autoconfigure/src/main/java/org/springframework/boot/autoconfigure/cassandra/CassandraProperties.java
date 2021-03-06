/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.cassandra;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.ProtocolOptions;
import com.datastax.driver.core.ProtocolOptions.Compression;
import com.datastax.driver.core.QueryOptions;
import com.datastax.driver.core.SocketOptions;
import com.datastax.driver.core.policies.LoadBalancingPolicy;
import com.datastax.driver.core.policies.ReconnectionPolicy;
import com.datastax.driver.core.policies.RetryPolicy;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for Cassandra.
 *
 * @author Julien Dubois
 * @author Phillip Webb
 * @since 1.3.0
 */
@ConfigurationProperties(prefix = "spring.data.cassandra")
public class CassandraProperties {

	/**
	 * Keyspace name to use.
	 */
	private String keyspaceName;

	/**
	 * Name of the Cassandra cluster.
	 */
	private String clusterName;

	/**
	 * Comma-separated list of cluster node addresses.
	 */
	private String contactPoints = "localhost";

	/**
	 * Port of the Cassandra server.
	 */
	private int port = ProtocolOptions.DEFAULT_PORT;

	/**
	 * Login user of the server.
	 */
	private String username;

	/**
	 * Login password of the server.
	 */
	private String password;

	/**
	 * Compression supported by the Cassandra binary protocol.
	 */
	private Compression compression = Compression.NONE;

	/**
	 * Class name of the load balancing policy.
	 */
	private Class<? extends LoadBalancingPolicy> loadBalancingPolicy;

	/**
	 * Queries consistency level.
	 */
	private ConsistencyLevel consistencyLevel;

	/**
	 * Queries serial consistency level.
	 */
	private ConsistencyLevel serialConsistencyLevel;

	/**
	 * Queries default fetch size.
	 */
	private int fetchSize = QueryOptions.DEFAULT_FETCH_SIZE;

	/**
	 * Reconnection policy class.
	 */
	private Class<? extends ReconnectionPolicy> reconnectionPolicy;

	/**
	 * Class name of the retry policy.
	 */
	private Class<? extends RetryPolicy> retryPolicy;

	/**
	 * Socket option: connection time out.
	 */
	private int connectTimeoutMillis = SocketOptions.DEFAULT_CONNECT_TIMEOUT_MILLIS;

	/**
	 * Socket option: read time out.
	 */
	private int readTimeoutMillis = SocketOptions.DEFAULT_READ_TIMEOUT_MILLIS;

	/**
	 * Enable SSL support.
	 */
	private boolean ssl = false;

	/**
	 * Socket option: TCP keepalive.
	 */
	private Boolean keepAlive;

	/**
	 * Pooling option: core number of connections per local host.
	 */
	private Integer corePoolLocal;

	/**
	 * Pooling option: maximum number of connections per local host.
	 */
	private Integer maxPoolLocal;

	/**
	 * Pooling option: core number of connections per remote host.
	 */
	private Integer corePoolRemote;

	/**
	 * Pooling option: maximum number of connections per remote host.
	 */
	private Integer maxPoolRemote;

	/**
	 * Pooling option: threshold that triggers the creation of a new connection to a local
	 * host.
	 */
	private Integer newConnectionThresholdLocal;

	/**
	 * Pooling option: threshold that triggers the creation of a new connection to a
	 * remote host.
	 */
	private Integer newConnectionThresholdRemote;

	/**
	 * Pooling option: maximum number of requests per local connection.
	 */
	private Integer maxRequestsPerConnectionLocal;

	/**
	 * Pooling option: maximum number of requests per remote connection.
	 */
	private Integer maxRequestsPerConnectionRemote;

	public String getKeyspaceName() {
		return this.keyspaceName;
	}

	public void setKeyspaceName(String keyspaceName) {
		this.keyspaceName = keyspaceName;
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getContactPoints() {
		return this.contactPoints;
	}

	public void setContactPoints(String contactPoints) {
		this.contactPoints = contactPoints;
	}

	public int getPort() {
		return this.port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Compression getCompression() {
		return this.compression;
	}

	public void setCompression(Compression compression) {
		this.compression = compression;
	}

	public Class<? extends LoadBalancingPolicy> getLoadBalancingPolicy() {
		return this.loadBalancingPolicy;
	}

	public void setLoadBalancingPolicy(
			Class<? extends LoadBalancingPolicy> loadBalancingPolicy) {
		this.loadBalancingPolicy = loadBalancingPolicy;
	}

	public ConsistencyLevel getConsistencyLevel() {
		return this.consistencyLevel;
	}

	public void setConsistencyLevel(ConsistencyLevel consistency) {
		this.consistencyLevel = consistency;
	}

	public ConsistencyLevel getSerialConsistencyLevel() {
		return this.serialConsistencyLevel;
	}

	public void setSerialConsistencyLevel(ConsistencyLevel serialConsistency) {
		this.serialConsistencyLevel = serialConsistency;
	}

	public int getFetchSize() {
		return this.fetchSize;
	}

	public void setFetchSize(int fetchSize) {
		this.fetchSize = fetchSize;
	}

	public Class<? extends ReconnectionPolicy> getReconnectionPolicy() {
		return this.reconnectionPolicy;
	}

	public void setReconnectionPolicy(
			Class<? extends ReconnectionPolicy> reconnectionPolicy) {
		this.reconnectionPolicy = reconnectionPolicy;
	}

	public Class<? extends RetryPolicy> getRetryPolicy() {
		return this.retryPolicy;
	}

	public void setRetryPolicy(Class<? extends RetryPolicy> retryPolicy) {
		this.retryPolicy = retryPolicy;
	}

	public int getConnectTimeoutMillis() {
		return this.connectTimeoutMillis;
	}

	public void setConnectTimeoutMillis(int connectTimeoutMillis) {
		this.connectTimeoutMillis = connectTimeoutMillis;
	}

	public int getReadTimeoutMillis() {
		return this.readTimeoutMillis;
	}

	public void setReadTimeoutMillis(int readTimeoutMillis) {
		this.readTimeoutMillis = readTimeoutMillis;
	}

	public boolean isSsl() {
		return this.ssl;
	}

	public void setSsl(boolean ssl) {
		this.ssl = ssl;
	}

	public Boolean isKeepAlive() {
		return this.keepAlive;
	}

	public void setKeepAlive(Boolean keepAlive) {
		this.keepAlive = keepAlive;
	}

	public Integer getCorePoolLocal() {
		return this.corePoolLocal;
	}

	public void setCorePoolLocal(Integer corePoolLocal) {
		this.corePoolLocal = corePoolLocal;
	}

	public Integer getMaxPoolLocal() {
		return this.maxPoolLocal;
	}

	public void setMaxPoolLocal(Integer maxPoolLocal) {
		this.maxPoolLocal = maxPoolLocal;
	}

	public Integer getCorePoolRemote() {
		return this.corePoolRemote;
	}

	public void setCorePoolRemote(Integer corePoolRemote) {
		this.corePoolRemote = corePoolRemote;
	}

	public Integer getMaxPoolRemote() {
		return this.maxPoolRemote;
	}

	public void setMaxPoolRemote(Integer maxPoolRemote) {
		this.maxPoolRemote = maxPoolRemote;
	}

	public Integer getNewConnectionThresholdLocal() {
		return this.newConnectionThresholdLocal;
	}

	public void setNewConnectionThresholdLocal(Integer newConnectionThresholdLocal) {
		this.newConnectionThresholdLocal = newConnectionThresholdLocal;
	}

	public Integer getNewConnectionThresholdRemote() {
		return this.newConnectionThresholdRemote;
	}

	public void setNewConnectionThresholdRemote(Integer newConnectionThresholdRemote) {
		this.newConnectionThresholdRemote = newConnectionThresholdRemote;
	}

	public Integer getMaxRequestsPerConnectionLocal() {
		return this.maxRequestsPerConnectionLocal;
	}

	public void setMaxRequestsPerConnectionLocal(Integer maxRequestsPerConnectionLocal) {
		this.maxRequestsPerConnectionLocal = maxRequestsPerConnectionLocal;
	}

	public Integer getMaxRequestsPerConnectionRemote() {
		return this.maxRequestsPerConnectionRemote;
	}

	public void setMaxRequestsPerConnectionRemote(Integer maxRequestsPerConnectionRemote) {
		this.maxRequestsPerConnectionRemote = maxRequestsPerConnectionRemote;
	}

}
