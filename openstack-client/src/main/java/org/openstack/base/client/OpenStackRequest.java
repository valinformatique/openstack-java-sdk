package org.openstack.base.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenStackRequest {
	
	private String endpoint;
	
	private String method;
	
	private StringBuilder path = new StringBuilder();
	
	private Map<String, List<Object>> headers = new HashMap<String, List<Object>>();
	
	private Entity entity;

	public String execute(String method, String path, Class<String> responseType) {
		return null;
	}
	
	public OpenStackRequest endpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}
	
	public String endpoint() {
		return endpoint;
	}

	public OpenStackRequest method(String method) {
		this.method = method;
		return this;
	}
	
	public String method() {
		return method;
	}
	
	public OpenStackRequest path(String path) {
		this.path.append(path);
		return this;
	}
	
	public String path() {
		return path.toString();
	}

	public OpenStackRequest header(String name, Object... values) {
		headers.put(name, Arrays.asList(values));
		return this;
	}
	
	public Map<String, List<Object>> headers() {
		return headers;
	}
	
	public <T> OpenStackRequest entity(T entity, String contentType) {
		this.entity = new Entity<T>(entity, contentType);
		return this;	
	}
	
	public Entity<?> entity() {
		return entity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OpenStackRequest [endpoint=" + endpoint + ", method=" + method
				+ ", path=" + path + ", headers=" + headers + "]";
	}

	public <T> void json(T entity) {
		entity(entity, "application/json");
	}

	public static class Entity<T> {
		
		private T entity;
		
		private String contentType;

		public Entity(T entity, String contentType) {
			super();
			this.entity = entity;
			this.contentType = contentType;
		}

		/**
		 * @return the entity
		 */
		public T getEntity() {
			return entity;
		}

		/**
		 * @param entity the entity to set
		 */
		public void setEntity(T entity) {
			this.entity = entity;
		}

		/**
		 * @return the contentType
		 */
		public String getContentType() {
			return contentType;
		}

		/**
		 * @param contentType the contentType to set
		 */
		public void setContentType(String contentType) {
			this.contentType = contentType;
		}
		
	}
	
}