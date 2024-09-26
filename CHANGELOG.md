## [v2.0.0-RC1] - WebForms API v1.1.0-1.0.4 - 2024-09-24
### Changed
- Added support for version v1.1.0-1.0.4 of the DocuSign WebForms API.
- Updated the SDK release version. 
- Model classes are now serializable.
- Resolved an issue where setting a default SSL socket for the entire JVM caused unintended side effects.
- Fixed a memory leak related to the class loader.
- Addressed dependency vulnerabilities in the following libraries:
  - bcprov-jdk18on updated to version 1.78.1
  - com.fasterxml.jackson.core updated to version 2.17.1
  - org.json updated to version 20240303
  - jersey updated to version 3.1.6
- Modified the default basePath to DEMO_REST_BASEPATH.

### Breaking changes
- Deprecation of OLTU library: The OLTU library for handling OAuth is no longer used.
### Other Changes
- Upgradation of OWASP for vulnerability check of dependencies.

## Important Action Required
- User needs to update the base URL in your codebase (if passing to SDK explicitly) and remove the /v1.1 component at the end of the URL for the SDK to work properly with this release.

## [v1.0.0] - WebForms API v1.1.0-1.0.2 - 2024-02-14
## Version 1.0.0 (Initial Release)
- Introducing the SDK based on the OpenAPI specification of DocuSign WebForms APIs.
- This release marks the initial availability of the SDK, providing developers with the necessary tools to interact with DocuSign WebForms APIs seamlessly.
## [v1.0.2-RC12] - WebForms API v1.1.0-1.0.2 - 2024-02-09
### Breaking Changes

- **`baseUrl` Defaulting to DEMO URL:** 
  - The `baseUrl` now defaults to the DEMO URL if not provided. Please update your configurations accordingly.

### Other Changes

- Updated the SDK release version
## [v1.0.2-RC11] - WebForms API v1.1.0-1.0.2 - 2024-02-08
### Changed
- Added support for version v1.1.0-1.0.2 of the DocuSign WebForms API.
- Updated the SDK release version.

## [v1.0.1-RC9] - WebForms API v1.1.0-1.0.1 - 2024-02-05
### Changed
- Added support for version v1.1.0-1.0.1 of the DocuSign WebForms API.
- Updated the SDK release version.

## [v1.0.0] - WebForms API v1.1-1.1.1 - 2023-11-27
### Changed
- Added support for version v1.1-1.1.1 of the DocuSign WebForms API.
- Updated the SDK release version.

