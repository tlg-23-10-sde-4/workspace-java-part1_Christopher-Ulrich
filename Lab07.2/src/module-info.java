/*
 * A module is a collection of related packages.
 * The packages that live with this config file (called a "module" descriptor")
 * are the packages in the module.
 *
 * There is no explicit listing of them in the { } below.
 * com.entertainment
 * com.entertainment.util
 */

module com.entertainment{
    // which of my packages are 'exposed' to other Java modules?

    exports com.entertainment;
}