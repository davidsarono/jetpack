package id.compose.jetpack.data.model

data class Character(
    val id: Int,
    val name: String,
    val image: String,
    val bio: Bio,
    val physicalDescription: PhysicalDescription,
    val personalInformation: PersonalInformation,
    val politicalInformation: PoliticalInformation,
    val chronologicalInformation: ChronologicalInformation
)

data class Bio(
    val alternativeNames: List<String>,
    val nationality: String,
    val ethnicity: String,
    val ages: List<String>,
    val born: String,
    val died: List<String>
)

data class PhysicalDescription(
    val gender: String,
    val eyeColor: String,
    val hairColor: String,
    val skinColor: String
)

data class PersonalInformation(
    val allies: List<String>,
    val enemies: List<String>,
    val weaponsOfChoice: List<String>,
    val fightingStyles: List<String>
)

data class PoliticalInformation(
    val profession: String,
    val position: String,
    val predecessor: String,
    val successor: String,
    val affiliations: String
)

data class ChronologicalInformation(
    val firstAppearance: String,
    val lastAppearance: List<String>,
    val voicedBy: List<String>
)
