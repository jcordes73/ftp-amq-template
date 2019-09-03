package org.mycompany;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration parameters filled in from application.properties and overridden using env variables on OpenShift.
 */
@Configuration
@ConfigurationProperties(prefix = "ftp")
public class FTPConfiguration {

    /**
     * FTP host
     */
    private String host;

    /**
     * FTP port
     */
    private String port;

    /**
     * FTP username
     */
    private String username;

    /**
     * FTP password
     */
    private String password;

    /**
     * FTP include
     */
    private String include;
    
    /**
     * FTP delete
     */
    private String delete;
    
    /**
     * FTP delete
     */
    private String passiveMode;

    
    public FTPConfiguration() {
    }


	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getInclude() {
		return include;
	}


	public void setInclude(String include) {
		this.include = include;
	}


	public String getDelete() {
		return delete;
	}


	public void setDelete(String delete) {
		this.delete = delete;
	}


	public String getPassiveMode() {
		return passiveMode;
	}


	public void setPassiveMode(String passiveMode) {
		this.passiveMode = passiveMode;
	}
}