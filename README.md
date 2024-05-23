## Design Problem

The Justice League has had another run in with the Legion of Doom, led this time by Vandal Savage. The Legion’s newest scheme involves pelting the earth with a series of giant meteors. The plan is to cause widespread earthquakes and therefore destruction, ushering in a new age of civilization, with Vandal Savage in charge. Luckily, Batman has a contingency plan for every situation. He is going to have Superman fly up into the atmosphere and use his heat vision to destroy the meteors (or at least blow them up into smaller pieces) in the order that they are going to reach the ground. Batman needs a program into which he can enter meteors as they are discovered and which will output the meteors in the correct order so that he can tell Superman which one to destroy next.


## Clarifications or Questions

- Should the impact times be unique, or can there be multiple meteors with the same impact time?
- How should the system handle cases where two meteors have the same impact time?
- Is there a maximum number of meteors expected to be managed by this system?
- Should the system support any updates to the impact time of an already registered meteor?

## Design Decisions and Assumptions

- **Data Structure:** A PriorityQueue is used to efficiently manage and retrieve the meteors based on their impact times.
- **Uniqueness:** It is assumed that impact times are unique. If not, the system will handle them based on the natural ordering of insertion.
- **Order:** The PriorityQueue ensures that the meteor with the earliest impact time is always at the front of the queue.
- **Extensibility:**  The design can be extended to support additional features like updating impact times or handling duplicate impact times.
- **Exception Handling:** Added to handle null meteors, empty queue retrievals, and invalid meteor properties.