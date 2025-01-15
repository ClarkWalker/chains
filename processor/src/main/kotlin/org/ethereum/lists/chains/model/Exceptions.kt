package org.ethereum.lists.chains.model

import java.io.File

class FileNameMustMatchChainId : Exception("chainId must match the filename")
class ExtensionMustBeJSON : Exception("filename extension must be json")
class ShouldHaveNoExtraFields(fields: Set<String>) : Exception("should have no extra field $fields")
class ShouldHaveNoMissingFields(fields: Set<String>) : Exception("missing field(s) $fields")
class RPCMustBeList : Exception("rpc must be a list")
class RPCMustBeListOfStrings : Exception("rpc must be a list of strings")
class ENSMustBeObject: Exception("ens must be an object")
class ENSMustHaveOnlyRegistry: Exception("ens can only have a registry currently")
class ENSRegistryAddressMustBeValid: Exception("ens registry must have valid address")
class NameMustBeUnique(dup: String): Exception(" name must be unique - but found `$dup` more than once")
class ShortNameMustBeUnique(dup: String): Exception("short name must be unique - but found `$dup` more than once")
class ShortNameMustNotBeStar: Exception("short name must not be '*'")
class UnsupportedNamespace: Exception("So far only the EIP155 namespace is supported")
class ExplorersMustBeArray: Exception("explorers must be an array")
class ExplorerMustHaveName: Exception("Explorer must have name")
class ExplorerMustWithHttps: Exception("Explorer have url starting with https://")
class ExplorerCannotEndInSlash: Exception("Explorer cannot have a slash on the end")
class ExplorerStandardMustBeEIP3091OrNone: Exception("explorer standard must be 'none' or 'EIP3091'")
class ParentHasInvalidType(type: String?): Exception("Parent has invalid type $type - only L2 or shard allowed")
class ParentMustBeObject: Exception("parent must be an object")
class ParentMustHaveChainAndType: Exception("parent must have fields 'chain' and 'type'")
class ParentHasExtraFields(fields: Set<String>): Exception("parent has extra field: $fields")
class ParentBridgeNoArray: Exception("parent bridge must be array")
class BridgeNoObject: Exception("parent bridges must be array consisting of json objects")
class BridgeOnlyURL: Exception("parent bridge only contain an URL")
class ParentChainDoesNotExist(chain: String): Exception("Referenced parent chain ($chain) does not exist")
class StatusMustBeString: Exception("status must be a string")
class StatusMustBeIncubatingActiveOrDeprecated: Exception("status must be either incubating, active or deprecated")
class NativeCurrencyMustBeObject: Exception("Native currency must be object")
class NativeCurrencySymbolMustBeString: Exception("Native currency symbol must be string")
class NativeCurrencySymbolMustHaveLessThan7Chars: Exception("Native currency symbol must have less than 7 chars")
class NativeCurrencyCanOnlyHaveSymbolNameAndDecimals: Exception("Native currency can only have symbol decimals and name")
class NativeCurrencyDecimalMustBeInt: Exception("Native currency decimals must be int")
class NativeCurrencyNameMustBeString: Exception("Native currency name must be string")

class UnreferencedIcon(fileName: String, iconsDownloadPath: File): Exception("Found file $fileName in $iconsDownloadPath that is not referenced")