/**
 * This module is the 'client' module, and it consists of packages:
 *  com.entertainment.client
 *
 *  As the 'client' module, it does not export anything.
 *  BUT it does need to declare a dependency on module com.entertainment.
 */

module com.entertainment.client {
    // Which other *modules* does this module depend on?
    // This module has access (visibility) ONLY to the other module's *exported* packages
    requires com.entertainment;
}